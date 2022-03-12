#@wip
Feature: Apply a voucher

  Scenario Outline: A user should be able to apply the voucher code for discount "<product>"
    Given A user is on the Fashionette webpage
    When A user searchs "<product>" on the search box
    And A user clicks on that product
    And A user adds the "<product>" to the cart
    And A user navigates to the cart
    When A user applies the voucher "qachallenge" to the cart
    Then A user sees that voucher code successfully applied message
    Then the voucher is properly applied

    Examples:
      | product   |
      |  Liz Shopper Medium Black Shopper  |
