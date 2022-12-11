package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;
public class SanjedaPage {

	WebDriver driver;
	CommonWaits waits;

	public SanjedaPage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//button[@class = 'OpenQrfButton button-primary']) [3]")
	WebElement StartNewQuote;
	
	@FindBy (xpath = "(//button[@class= 'SiteHeader__submenu-toggle a _hover-underline'])[1]")
	WebElement signIn;
	
	@FindBy(xpath = "(//a[@href = 'https://myaccount.amfam.com/enroll']) [2]")
	WebElement createAccount;
	
	@FindBy(id = "uid_61")
	WebElement zip;
	
	@FindBy(xpath = "(//div[@class= 'SelectionTiles__tile QrfProductTiles__tile']) [1]")
	WebElement car;
	
	@FindBy(xpath = "//span[@class= 'LoadingButton__content']")
	WebElement letsgo;
	
	
	public void quote() {
		click(StartNewQuote);
	}
	
	public void zip(String zipcode) {
		click(zip);
		input(zip, "85142");
		sleep(2);
	}
	
	public void clickCar() {
		click(car);
		sleep(2);
	}

	public void clickLetsGo() {
		click(letsgo);
		sleep(2);
	}

	public void sign() {
		click(signIn);
		sleep(2);
	}
	public void createAcc() {
		click(createAccount);
		sleep(2);
	}
	
}
