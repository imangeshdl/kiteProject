package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class kiteLogin {

	@FindBy(xpath="//input[@id='userid']" )
	WebElement Userid;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwrd;
	
	@FindBy(xpath="//button[text()='Login ']")
	WebElement LoginButton;
	
	
	@FindBy(xpath="//input[@id='pin']")
	WebElement Pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	WebElement ContinueButton;
	
	
}
