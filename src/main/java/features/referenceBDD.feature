@MyFirstBDDTest
Feature: Person should be able choose and buy phone in "Amazon"
  If there are no Items what person searching for -- should be warning message.


  Scenario: Login with valid credentials and order 2 existing goods
    Given Open chrome and get store site
    When I click link "Account&Lists" ,I fill "email" with valid data and "password"  with valid data and click "logIn" button
    And  Login should be successful, I have "Home page" and greetings "Hello, Denys".
    And  Type first item choose from list and add it to cart
    And  Type second item choose from list and add it to cart
    Then In cart should be 2 new items "Apple iPhone 7 Plus" and "Samsung Galaxy S7"


  Scenario: Login with invalid credentials
    Given Open chrome and get store site
    When I click link "Account&Lists" ,I fill "email" with invalid data and "password"  with invalid data and click "logIn" button
    Then Should be warning massage, something like "You entered invalid login or password"
