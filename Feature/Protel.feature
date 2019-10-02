
Feature: LoginAction
 
  Scenario: ProtelTestScenarios
    Given I open the web page
    And I click the sign in button
		And I write my email
    And I click Create New Account button
    And I select gender
    And I set the name textbox 'Irmak'
    And I set the surname textbox 'Ozgen'
    And I set the password textbox '123456'
    And I select the 'days' options '5'
    And I select the 'months' options '4'
    And I select the 'years' options '2001'
    And I set the address textbox 'blalblabla'
    And I set the city textbox 'USA'
    And I select the 'state' options '4'
    And I set the postcode textbox '00000'
    And I set the mobile phone textbox '5358539308'
    And I set the alias textbox 'Alias'
    And I click the Submit Button
    And I click the Sign out Button
    And I write my generated email to sign in
    And I set the existing password textbox '123456'
    And I click the submit login button
    And I set the search textbox 'faded'
    And I click Submit Search
    And I click Add To Card
    
    