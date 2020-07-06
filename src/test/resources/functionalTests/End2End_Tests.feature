#Author: ssotiriou@hotmail.com


Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End Integration

  Scenario: Customer place an order by purchasing an item from search
    Given User is on home page
    When He searches for "dress"
    And Choose to buy the first item
    And Moves to checkout from mini cart
    And Enter personal details on checkout page
    And Select same delivery address
    And Select payment method as "CheckPayment" payment
    And Place the order
    Then Verify the order details
    