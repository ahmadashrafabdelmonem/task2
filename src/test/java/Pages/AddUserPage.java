package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserPage 
{
	private WebDriver driver;
	
	public AddUserPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void selectUserRole() 
	{
		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		
		List<WebElement>options = driver.findElements(By.xpath("//div[contains(@class,'oxd-select-option')]"));
		
		for(WebElement op:options)
		{			
			System.out.println(op.getText());
		}
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")).click();
		
	}
	
	public void enterEmployeeName(String newName) 
	{
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys(newName);
		
		new WebDriverWait(driver,Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Peter Mac Anderson')]"))).click();
		
	}
	
	public void selectUserStatus() 
	{
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		List<WebElement>options = driver.findElements(By.xpath("//div[contains(@class, 'oxd-select-option')]"));		
		
		for(WebElement op:options)
		{			
			System.out.println(op.getText());
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
		
	}
	
	public void enterEmployeeUserName(String newUsername) 
	{
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys(newUsername);
	}
	
	public void enterEmployeePassword(String newPassword) 
	{
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys(newPassword);
	}
	
	public void confirmEmployeePassword(String confirmPassword) 
	{
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys(confirmPassword);
	}
	
	public void submitNewEmployee() 
	{
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
}
//div[contains(text(),'Admin')]
//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]