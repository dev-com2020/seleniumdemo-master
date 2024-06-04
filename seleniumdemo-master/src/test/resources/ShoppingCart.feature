Feature: Shopping Cart
  As a customer
  I want to add items to my shopping cart
  So that I can purchase them later

  Scenario: Add items to the shopping cart
    Given I am on the shopping page
    When I add "Cucumber", "Brocolli", and "Beetroot" to the cart
    And I proceed to checkout
    And I enter the promo code "rahulshettyacademy"
    Then I should see the promo code applied successfully