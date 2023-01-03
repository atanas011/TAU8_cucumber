Feature: Login Functionality
  In order to use internet banking
  As a valid ParaBank client
  User wants to log in successfully

  Scenario: Successful Login
    Given User is on the Login page of the ParaBank app
    When User enters valid credentials
      | Ana | 123 |
    Then Overview page should be displayed

# Ctrl + click on step description > go to step definition file
# Run > Modify Run Config > Before launch > Build > "-" > "+" > Build Project > OK