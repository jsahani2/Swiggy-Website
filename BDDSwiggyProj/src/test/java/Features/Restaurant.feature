#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tagRestaurant
Feature: Search Restautants/Dishes
  I want to use this template for Restaurant/Dishes 

  @tagSearch
  Scenario: Jash is able to Search Restautants/Dishes
    Given Jash clicks on Search Button
    When Jash searches for "Biryani"
    Then Jash clicks on Dish
    
   @tagOrder
   Scenario: Jash is able to add Dish to cart
    Given Jash is on search page
    And Jash select dish from options
    When Jash clicks on image
    And Jash adds dish into the cart       
    Then Jash open the cart

    
