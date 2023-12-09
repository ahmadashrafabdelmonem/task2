package StepDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddUserPage;
import Pages.AdminPage;
import Pages.LoginPage;
import Pages.SearchUserPage;

public class DemoPom 
{
	private WebDriver driver;
    private LoginPage loginPage;
    private AdminPage adminPage;
    private AddUserPage addUserPage;
    private SearchUserPage searchUserPage;
    
    
    @Given("I am on the login page")
    public void LoginPage()
    {
    	driver = new ChromeDriver();
    	loginPage = new LoginPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    	loginPage.navigateToLoginPage("https://opensource-demo.orangehrmlive.com/");
    }
    
    @When ("I enter {string} as username")
    public void iEnterAsUsername(String username)
    {
    	loginPage.enterUsername("Admin");
    }
    
    @When("I enter {string} as password")
    public void iEnterAsPassword(String password) 
    {
        loginPage.enterPassword(password);
    }
    
    @When("I click on the login button")
    public void iClickOnTheLoginButton() 
    {
        loginPage.clickLogin();
    }
    
    @Then("I navigate to the Admin page")
    public void iNavigateToTheAdminPage() 
    {
        adminPage = new AdminPage(driver);
        adminPage.checkUserNavigatedToAdmin();
    }
    
    @And("I click on the Admin Tab")
    public void iClickOnTheAdminTab()
    {
    	adminPage.clickOnAdminTab();
    }
    
    @Then("I get the number of records")
    public void iGetNumberOfRecords() {
        adminPage.getNumberOfRecords();
    }
    
    @And("I click on add button")
    public void iClickOnAddButton()
    {
    	adminPage.clickAddButton();
    }
    
    @And("I fill the required data")
    public void iAddNewUser()
    {
    	addUserPage = new AddUserPage(driver);
    	addUserPage.selectUserRole();
    	addUserPage.enterEmployeeName("C");    	
    	addUserPage.selectUserStatus();
    	addUserPage.enterEmployeeUserName("Ahmed Test");
    	addUserPage.enterEmployeePassword("Ahmed123!!");
    	addUserPage.confirmEmployeePassword("Ahmed123!!");
    }
    
    @And("I click on save button")
    public void saveNewUserInfo()
    {
    	addUserPage.submitNewEmployee();
    }
    
    @Then("I verify that the number of records increased by 1")
    public void addingNewRecord()
    {
    	adminPage.getNumberOfRecords();
    }
    
    @And("I search for the new user")
    public void searchForUser()
    {
    	searchUserPage = new SearchUserPage(driver);
    	searchUserPage.searchUsername("Ahmed Test");
    	searchUserPage.clickOnSearchButton();
    }
    
    @And("I delete the new user")
    public void deleteRecentUser()
    {
    	searchUserPage.deleteCreatedUser();
    	searchUserPage.confirmDeleteUser();
    }
    
    @Then("I verify that the number of records decreased by 1")
    public void removeNewRecord()
    {
    	adminPage.clickOnAdminTab();
    	adminPage.getNumberOfRecords();
    }

}
