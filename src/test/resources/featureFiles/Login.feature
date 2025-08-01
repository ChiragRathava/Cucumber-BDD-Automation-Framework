Feature: Practice Test Login

  Scenario: Successful login with valid credentials
    Given I am on login page
    When I login as "student" with password "Password123"
    Then I should be logged in successfully

  Scenario Outline: Login failure with invalid credential
    Given I am on login page
    When I login as "<username>" with password "<password>"
    Then I should see error "<errorMessage>"

    Examples:
      | username      | password         | errorMessage                      |
      | incorrectUser | Password123      | Your username is invalid!         |
      | student       | incorrectPass    | Your password is invalid!         |
      |               | Password123      | Your username is invalid!         |
