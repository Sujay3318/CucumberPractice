package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	WebDriver driver;
	
	
	By username=By.id("username");
	
	By password=By.id("password");
	
	By button=By.xpath("//button[text()='Login to QKart']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonLogin()
	{
		driver.findElement(button).click();
	}
	
	public void navigateToLoginPage(String uri)
	{
		driver.navigate().to(uri);
	}
	
	
}
