Feature: Scenario Outline File
Scenario Outline: Login
    Given user not logged in
    When user performs login <username> and <password>
    Then logged in successfully
    Examples: 
      | username||password |
      | mercury || mercury |
      | tutorial|| tutorial| 
