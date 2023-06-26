Feature: Login

    @id:1@regression@smoke
    Scenario: User able to login with correct credentials
      Given User input "valid@email.com" in email field
      When User input "validPassword" in password field
      And User click submit button
      Then User redirected to homepage

    @id:2@regression
    Scenario Outline: User cannot login with invalid credentials
      Given User input <email> in email field
      When User input <password> in password field
      And User click submit button
      Then User able to see toaster error

      Examples:
        | email             | password        |
        | invalid@email.com | validPassword   |
        | valid@email.com   | invalidPassword |
