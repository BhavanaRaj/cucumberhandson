#Feature: Demo File
#Scenario: Print Hello World

#When user enters hello world
#Then console displays the same       
Feature: Back Ground Demo

Background: User Login

Given User is in the Login Page
When User enters valid credentials and performs Login
Then User must be navigated to the Home Page

Scenario: Search Product

Given User must be in the search page
When User searches for a product by category
Then Product decsription is displayed

Scenario: Add to Cart

Given Search the product to purchase
When select the product and add it to the cart.
Then Product is successfully added to the cart
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   