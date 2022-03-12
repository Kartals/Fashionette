#@wip
Feature: Login functionality

  Background:
    Given A user is on the Fashionette webpage
    And A user is on the login page

  Scenario: Login attempt with valid credentials
    When A user enters valid credentials
    Then A user should be able to login

  Scenario Outline: Login attempt with invalid credentials
    When A user enters with the invalid credentials "<username>" "<password>"
    Then get the message "Das hat leider nicht funktioniert. Bitte überprüfe Deine E-Mail Adressse und Dein Passwort. Solltest du Dein Passwort vergessen haben, kannst Du ein neues Passwort anfordern, indem Du auf \"Passwort vergessen\" klickst."

    Examples:
      |  username                                 |  password |
      |  wronguser@gmail.com                      | !8Ntr*BM@!#G3VH|
      |  QA@fashionette.de                        | Wrongpass1 |
      |  wronguser@gmail.com                      | wrongpass1 |



