@Test1
Feature: first feature

  @SearchTest1
  Scenario: Search a product
    Given I Search for "DSLR" Product
    And I tap on search button
    Then I should Search result

  @SearchTest2
  Scenario: Search a product
    Given I Search for "PS4" Product
#    And I tap on search button
#    Then I should Search result

