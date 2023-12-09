package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
        this.driver = driver;
    }
	
	public void navigateToLoginPage(String url) 
	{
        driver.get(url);
    }
	
	public void enterUsername(String username) 
	{
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
    }
	
	public void enterPassword(String password) 
	{
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	}
	
	public void clickLogin() 
	{
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
