Feature: searching products

Scenario Outline: searching products in yahoo

Given : i am on the yahoo homepage

When i enter the "<Product_name>" in the search bar
And i click on the search button

Then I can see the search results successfully


Examples:
| Product_name |
|     Facebook     |
|     Ebay         |
|     bangladesh   | 

