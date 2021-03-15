package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResourcePage {

	WebDriver P_driver;

	private StringBuffer verificationErrors = new StringBuffer();

	public ResourcePage(WebDriver driver)
	{
		this.P_driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "body.home.page-template-default.page.page-id-59272.wp-custom-logo.elementor-default.elementor-kit-59840.elementor-page.elementor-page-59272.kurtosys-mobile-menu-active.kurtosys-mobile-menu-visible:nth-child(11) div.elementor.elementor-3820.elementor-location-header:nth-child(1) div.elementor-inner div.elementor-section-wrap section.elementor-element.elementor-element-9e5844a.elementor-section-full_width.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section.elementor-sticky.elementor-sticky--effects.elementor-sticky--active.elementor-section--handles-inside:nth-child(1) div.elementor-container.elementor-column-gap-no div.elementor-row div.elementor-element.elementor-element-304bf8a.elementor-column.elementor-col-100.elementor-top-column div.elementor-column-wrap.elementor-element-populated div.elementor-widget-wrap div.elementor-element.elementor-element-7c3439d.elementor-widget.elementor-widget-template div.elementor-widget-container div.elementor-template div.elementor.elementor-59259.elementor-location-header:nth-child(2) div.elementor-inner div.elementor-section-wrap section.elementor-element.elementor-element-38607eb.elementor-section-height-min-height.elementor-section-content-space-between.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section div.elementor-container.elementor-column-gap-default div.elementor-row div.elementor-element.elementor-element-e67de72.elementor-column.elementor-col-25.elementor-top-column:nth-child(2) div.elementor-column-wrap.elementor-element-populated div.elementor-widget-wrap div.elementor-element.elementor-element-aec10d1.elementor-widget.elementor-widget-kurtosys-mega-menu div.elementor-widget-container div.menu-header-menu-container:nth-child(5) div.kurtosys-menu-container.kurtosys-mobile-menu.kurtosys-mobile-menu-active-state div.kurtosys-menu-inner ul.kurtosys-menu.kurtosys-menu--animation-type-fade.kurtosys-responsive-menu li.kurtosys-menu-item.kurtosys-menu-item-type-post_type.kurtosys-menu-item-object-page.kurtosys-no-roll-up.kurtosys-mega-menu-item.kurtosys-regular-item.kurtosys-menu-item-has-children.kurtosys-menu-item-59810.kurtosys-responsive-menu-item:nth-child(3) > a.top-level-link.menu-image-title-after") 
	private WebElement btn_Resource;

	@FindBy(xpath = "//a[contains(text(),'White papers')]")
	private WebElement drp_WhatePaper;

	@FindBy(xpath = "//p[contains(text(),'White Papers & eBooks')]")
	private WebElement titleWhitePaper;

	@FindBy(xpath = "//a[contains(text(),'UCITS White Paper')]")
	private WebElement link_UCti;

	//a[contains(text(),'UCITS White Paper')]
	public void clickResources()
	{
		btn_Resource.click();
	}

	public void clickWhitePaper()
	{
		drp_WhatePaper.click();
	}

	public void veriyfTitle()
	{
		try {
			assertEquals(titleWhitePaper.getText(), "Kurtosys White Papers For The Asset Management Industry | Kurtosys");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}
	
	public void clickUCIT()
	{
		link_UCti.click();
	}
}


