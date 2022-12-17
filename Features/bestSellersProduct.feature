Feature: searching best sellers
Scenario: seacrhing best sellers in amazon

Given I am on the amazon homepage

When I click on the all button
And I click on the best seller button

Then I can see the list of best selling products successfully
p