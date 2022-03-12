Feature: Add to Cart Functionality

  Scenario Outline: A user should be able to add a product to the cart, login and see the product in the cart
    Given A user is on the Fashionette webpage
    When A user searchs "<product>" on the search box
    And A user clicks on that product
    And A user adds the "<product>" to the cart
    When A user is on the login page
    And A user enters valid credentials
    Then A user should be able to login
    When A user navigates to the cart
    Then The selected "<product>" should be in the cart

    Examples:
      | product |
      |Liz Shopper Medium Black|
      |Chronograph Leather Watch Gift Set Black |


