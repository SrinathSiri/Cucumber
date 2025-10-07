Feature: SFLY3 Production Login using Cucumber BDD PAVAN

  Scenario: Login
    Given Open browser and enter application url
    When Enter username, password and click on login
    Then Verification for HomePage
    When Click on Profile icon and logout
    And Close Browser

  Scenario: Parameter
    Given Browser open and enter application url
    When Please enter "john.sample@gmail.com","Gudeat18@" and click login button
    Then Home page verification
    When Profile icon click and logout
    And Browser Close

  Scenario Outline: DataDriven
    Given open browser enter application url
    When enter "<username>", "<password>" and click login
    Then verification Homepage
    When click on profile icon and logout
    And close browser

    Examples:
      | username              | password  |
      | john.sample@gmail.com | Gudeat18@ |
      | john.sample@gmail.com | Gudeat18@ |
