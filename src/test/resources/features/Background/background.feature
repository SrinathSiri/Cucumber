Feature: Orange HRM Application
  Background: login functionality
    Given login by providing username password


  Scenario: Login Appl and click Admin button
    When On homepage click on Admin
    Then get the adminpage url
    Then browser close

  Scenario: Login Appl and click on myinfo
    When on homepage click on myinfo
    Then get the myinfopage url
    Then browser close

  Scenario: Login appl and click on performance
    When on homepage click on performance
    Then get the performancepage url
    Then browser close
