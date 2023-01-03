Feature: Login Functionality
  In order to use internet banking
  As a valid ParaBank client
  User wants to log in successfully

  # run this
  Scenario Outline: Successful Login
    Given User is on the Login page of the ParaBank app
    When User enters valid <username> and <password>
    Then Overview page should be displayed
    Examples:
      | username | password |
      | "Ana"    | "123"    |
      | "Pera"   | "456"    |

# Ctrl + click on step description > go to step definition file
# Run > Modify Run Config > Before launch > Build > "-" > "+" > Build Project > OK