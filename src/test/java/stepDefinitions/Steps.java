package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.ResourcePage;
import pageObjects.WhitePaperPage;

public class Steps {
	private static WebDriver driver;
	ResourcePage resourcePage;
	WhitePaperPage whitePaperPage;
	
	@Given("user is on Home Page")
	public void user_is_on_home_page() 
	{
		System.setProperty("webdriver.chrome.driver","//QA_Technical_Assessment/src/test/resources/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.kurtosys.com/");
	}

	@Then("Navigate to RESOURCES")
	public void navigate_to_resources() {
		resourcePage = new ResourcePage(driver);
		resourcePage.clickResources();
	}

	@Then("From the drop down, click on White Papers & eBooks")
	public void from_the_drop_down_click_on_white_papers_e_books() {
		resourcePage.clickResources();
	}

	@Then("Verify Title reads White Papers")
	public void verify_title_reads_white_papers() {
		resourcePage.veriyfTitle();
	}

	@Then("Click on any white paper tile \\(eg. Click on UCITS Whitepaper)")
	public void click_on_any_white_paper_tile_eg_click_on_ucits_whitepaper() 
	{
		resourcePage.clickUCIT();
	}

	@Then("Enter person's details")
	public void enter_person_s_details() 
	{
		whitePaperPage = new WhitePaperPage(driver);
		whitePaperPage.Enter_PersonDetails();
	}
	
	@Then("Click Send me a copy")
	public void click_send_me_a_copy() 
	{
		whitePaperPage.Click_SendCopy();
	}

	@Then("Add screenshot of the error messages")
	public void add_screenshot_of_the_error_messages() {
	}

	@Then("Validate all error messages")
	public void validate_all_error_messages() {
	}
}
