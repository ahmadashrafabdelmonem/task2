package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage 
{
	private WebDriver driver;
	
	public AdminPage(WebDriver driver) 
    {
        this.driver = driver;
    }
	
	public void checkUserNavigatedToAdmin()
	{
		driver.findElement(By.cssSelector("h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
	}
	
	public void clickOnAdminTab() 
    {
    	driver.findElement(By.xpath("//*[text()='Admin']")).click();
    	
    }
	
	public void getNumberOfRecords() {
	    WebElement recordsElement = driver.findElement(By.cssSelector("div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] span[class='oxd-text oxd-text--span']"));
	    
	    String recordText = recordsElement.getText();
	    String originalRecordCount = recordText.replaceAll("[^0-9]", "");

	    // Check if the string is not empty before parsing
	    if (!originalRecordCount.isEmpty()) {
	        // Parse the strings to integers
	        int originalCount = Integer.parseInt(originalRecordCount);

	        // Perform an action that changes the record count
	        // For example, click a button that adds or deletes a record

	        // Get the updated record count
	        recordsElement = driver.findElement(By.cssSelector("div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] span[class='oxd-text oxd-text--span']"));
	        String updatedRecordText = recordsElement.getText();
	        String updatedRecordCount = updatedRecordText.replaceAll("[^0-9]", "");

	        // Check if the updated string is not empty before parsing
	        if (!updatedRecordCount.isEmpty()) {
	            // Parse the updated record count
	            int updatedCount = Integer.parseInt(updatedRecordCount);

	            // Compare the counts
	            if (updatedCount == originalCount + 1) {
	                System.out.println("Number of records incremented by 1");
	            } else if (updatedCount == originalCount - 1) {
	                System.out.println("Number of records decremented by 1");
	            } else {
	                System.out.println("Number of records did not change by 1");
	            }
	        } else {
	            System.out.println("Updated record count is empty");
	        }
	    } else {
	        System.out.println("Original record count is empty");
	    }
	}


	
	 public void clickAddButton() 
	 {
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	 }
	
}	

