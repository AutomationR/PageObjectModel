#Author: Valli
@tag
Feature: LetsTalkTea
  I want to use this template for my feature file

  @LetsTalkTea_Example
  Scenario: Lets TalkTea
   Given Launch  chrome browser and enter the URL
    When Click on the our passion link
    And Click on the our menu link
    And Click on the our letstalktea link
    And Click on the our checkout link
    And Enter details in the lets talk tea page
    
    @LetsTalkTea_Checkout
  Scenario: Lets TalkTea_Checkout
    Given Launch  chrome browser and enter the URL
   	When Click on the our checkout link
  	And  Enter the details in the checkout page
   
   @LetsTalkTea_letsTalkTeaPage
  Scenario: Lets TalkTea_letsTalkTea
  
      Given Launch  chrome browser and enter the URL
      When Click on the our letstalktea link
      And Enter details in the lets talk tea page
  
  
  
  
    
    
  