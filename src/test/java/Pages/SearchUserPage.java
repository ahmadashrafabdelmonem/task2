package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchUserPage 
{
	private WebDriver driver;
	
	public SearchUserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void searchUsername(String username) 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(username);
	}
	
	public void clickOnSearchButton()
	{
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
	
	public void deleteCreatedUser()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]/i")).click();
	}
	
	public void confirmDeleteUser() 
	{
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	}
}
