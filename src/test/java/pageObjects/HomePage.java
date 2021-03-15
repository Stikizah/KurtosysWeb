package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver P_driver;
	public HomePage(WebDriver driver)
    {
        this.P_driver = driver;
        PageFactory.initElements(driver, this);
    }
}
