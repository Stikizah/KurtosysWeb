package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhitePaperPage {
	WebDriver P_driver;
	
	public WhitePaperPage(WebDriver driver)
	{
		this.P_driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text() = 'First Name']")
	private WebElement txt_Fname;
	
	@FindBy(xpath = "//*[text() = 'Last Name']")
	private WebElement txt_Lname;
	
	@FindBy(xpath = "//*[text() = 'Email*']")
	private WebElement txt_Email;
	
	@FindBy(xpath = "//*[@id='18882_231675pi_18882_231675']")
	private WebElement txt_Company;
	
	@FindBy(xpath = "//*[@id='18882_231677pi_18882_231677']")
	private WebElement txt_Indastry;
	
	//*[@value="Send me a copy"]
	@FindBy(xpath = "//*[@value='Send me a copy']")
	WebElement clickSendCopy;
	
	public void EnterFname()
	{
		txt_Fname.sendKeys("Nhlakanipho");
	}
	public void EnterLName()
	{
		txt_Lname.sendKeys("Mthalane");
	}
	
	public void EnterEmail()
	{
		txt_Email.sendKeys("Nhlaka.sticks@outlook.com");
	}
	
	public void EnterCompany()
	{
		txt_Company.sendKeys("Testing");
	}
	
	public void EnterIndastry()
	{
		txt_Indastry.sendKeys("Testing Industry");
	}
	
	public void Enter_PersonDetails()
	{
		EnterFname();
		EnterLName();
		EnterEmail();
		EnterCompany();
		EnterIndastry();
	}
	
	public void Click_SendCopy()
	{
		clickSendCopy.click();
	}
	
}
