package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
	 WebDriver driver;
	 WebDriverWait wait;
	@FindBy(xpath="//input[@id='txtUsername']")//annotation or any word with @ symbol is called annotation
	private WebElement UserName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement PassWord;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement Loginbutton;
	
	//Annotations means tag we put in notes or books similar to that annotation works
	
	public LogIn(WebDriver driver)//constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	
	
	public void sendUserName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
		UserName.sendKeys("Admin");
	}
	
	public void sendPassWord()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
		PassWord.sendKeys("admin123");
	}
	
	public void clickLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnLogin']")));
		Loginbutton.click();
	}

}
