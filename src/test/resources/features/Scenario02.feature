Feature: Modify user information

  Scenario Outline: A user should be able to modify "<name>" "<surname>"
    Given A user is on the Fashionette webpage
    And A user is on the login page
    When A user enters valid credentials
    Then A user should be able to login
    When A user navigates to persönliche daten
    And A user clicks to bearbeiten button
    Then A user should be able to change "<name>" "<surname>"

    Examples:
      |  name                    |  surname |
      |  Rafael                  | Nadal    |
      |  Roger                   | Federer  |
      |  Martina                 | Klaim    |

