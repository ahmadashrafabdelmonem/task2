@tag
Feature: Admin User Management

  @tag1
  Scenario: Add and Delete User
    Given I am on the login page
    When I enter "Admin" as username
    And I enter "admin123" as password
    And I click on the login button
    Then I navigate to the Admin page
    And I click on the Admin Tab
    And I get the number of records
    And I click on add button
    And I fill the required data
    And I click on save button
    Then I verify that the number of records increased by 1
    And I search for the new user
    And I delete the new user
    Then I verify that the number of records decreased by 1


