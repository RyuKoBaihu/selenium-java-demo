@buy_item
Feature: Buying an item

  Scenario: Buy one item
    Given that I am logged
    When I buy an item
    Then I check if the order was finished