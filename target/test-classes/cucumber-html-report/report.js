$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("referenceBDD.feature");
formatter.feature({
  "line": 2,
  "name": "Person should be able choose and buy phone in \"Amazon\"",
  "description": "If there are no Items what person searching for -- should be warning message.",
  "id": "person-should-be-able-choose-and-buy-phone-in-\"amazon\"",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyFirstBDDTest"
    }
  ]
});
formatter.before({
  "duration": 4580005926,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with valid credentials and order 2 existing goods",
  "description": "",
  "id": "person-should-be-able-choose-and-buy-phone-in-\"amazon\";login-with-valid-credentials-and-order-2-existing-goods",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open chrome and get store site",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click link \"Account\u0026Lists\" ,I fill \"email\" with valid data and \"password\"  with valid data and click \"logIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Login should be successful, I have \"Home page\" and greetings \"Hello, Denys\".",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Type first item choose from list and add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Type second item choose from list and add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "In cart should be 2 new items \"Apple iPhone 7 Plus\" and \"Samsung Galaxy S7\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDScenarios.open_chrome_and_get()"
});
formatter.result({
  "duration": 2998231330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account\u0026Lists",
      "offset": 14
    },
    {
      "val": "email",
      "offset": 38
    },
    {
      "val": "password",
      "offset": 66
    },
    {
      "val": "logIn",
      "offset": 104
    }
  ],
  "location": "BDDScenarios.ligIn(String,String,String,String)"
});
formatter.result({
  "duration": 5690319771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home page",
      "offset": 36
    },
    {
      "val": "Hello, Denys",
      "offset": 62
    }
  ],
  "location": "BDDScenarios.succLogin(String,String)"
});
formatter.result({
  "duration": 82470607,
  "status": "passed"
});
formatter.match({
  "location": "BDDScenarios.findFirstItem()"
});
formatter.result({
  "duration": 18998521437,
  "status": "passed"
});
formatter.match({
  "location": "BDDScenarios.chooseAnotherItem()"
});
formatter.result({
  "duration": 20163637887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    },
    {
      "val": "Apple iPhone 7 Plus",
      "offset": 31
    },
    {
      "val": "Samsung Galaxy S7",
      "offset": 57
    }
  ],
  "location": "BDDScenarios.checkCart(Integer,String,String)"
});
formatter.result({
  "duration": 489827759,
  "status": "passed"
});
formatter.after({
  "duration": 1141527198,
  "status": "passed"
});
formatter.before({
  "duration": 3156241993,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "person-should-be-able-choose-and-buy-phone-in-\"amazon\";login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Open chrome and get store site",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click link \"Account\u0026Lists\" ,I fill \"email\" with invalid data and \"password\"  with invalid data and click \"logIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Should be warning massage, something like \"You entered invalid login or password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDScenarios.open_chrome_and_get()"
});
formatter.result({
  "duration": 3060903176,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account\u0026Lists",
      "offset": 14
    },
    {
      "val": "email",
      "offset": 38
    },
    {
      "val": "password",
      "offset": 68
    },
    {
      "val": "logIn",
      "offset": 108
    }
  ],
  "location": "BDDScenarios.typeInvalidCredentional(String,String,String,String)"
});
formatter.result({
  "duration": 3913116802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You entered invalid login or password",
      "offset": 43
    }
  ],
  "location": "BDDScenarios.invalidLogin(String)"
});
formatter.result({
  "duration": 53579964,
  "status": "passed"
});
formatter.after({
  "duration": 859548541,
  "status": "passed"
});
});