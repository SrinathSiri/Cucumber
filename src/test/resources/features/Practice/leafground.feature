Feature: LeafGround Application launch in chrome

  Scenario: Launch LeafGround Application and get current page url
    Given Launch the chrome browser
    When Load leafground Application
    Then Take current page title

  Scenario: LeafGround Parameter
    Given User name "SRINATH"
    When  Tech Architech "PAVAN"
    Then  Business Person "YADAGIRI"

  Scenario Outline: datadriven
    Given username "<usernm>" password "<passwd>"
    Examples:
    |usernm     |passwd     |
    |SRINATH    |SRI123     |
    |PAVAN      |123PAVAN   |
    |YADAGIRI   |YADAGIRI123|