Feature: Login Functionality
  In order to use internet banking
  As a valid ParaBank client
  User wants to log in successfully

  # register 2 users on website before running this
  Scenario Outline: Successful Login
    Given User is on the Login page of the ParaBank app
    When User enters valid <username> and <password> with <fullName>
    Then Overview page should be displayed
    Examples:
      | username | password | fullName     |
      | "Ana"    | "123"    | "Ana Ilic"   |
      | "Pera"   | "456"    | "Pera Peric" |

# Ctrl + click on step description > go to step definition file
# Run > Modify Run Config > Before launch > Build > "-" > "+" > Build Project > OK