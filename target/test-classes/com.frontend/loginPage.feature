Feature: Amazon login

  @test
  Scenario: Validate user can login to amazon

    Given the user login to amazon
    When the user selects the mobile in search
    Then the user successfully login