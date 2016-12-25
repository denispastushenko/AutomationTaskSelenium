$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("referenceBDD.feature");
formatter.feature({
  "line": 1,
  "name": "Person should be able choose and by phone in \"Amazon\"",
  "description": "If there are no Items what person searching for, should be warning message.",
  "id": "person-should-be-able-choose-and-by-phone-in-\"amazon\"",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login with valid credentials and order 2 existing goods",
  "description": "",
  "id": "person-should-be-able-choose-and-by-phone-in-\"amazon\";login-with-valid-credentials-and-order-2-existing-goods",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open chrome and get store site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click link \"Account\u0026Lists\" ,I fill \"email\" with valid data and \"password\"  with valid data and click \"logIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login should be successful, I have \"Home page\" and greetings \"Hello, Denys\".",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Type first item choose from list and add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Type second item choose from list and add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "In cart should be 2 new items \"Apple iPhone 7 Plus\" and \"Samsung Galaxy S7\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDScenarios.open_chrome_and_get()"
});
formatter.result({
  "duration": 15460780010,
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
  "duration": 11348231574,
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
  "duration": 1050932335,
  "status": "passed"
});
formatter.match({
  "location": "BDDScenarios.findFirstItem()"
});
formatter.result({
  "duration": 21440401716,
  "status": "passed"
});
formatter.match({
  "location": "BDDScenarios.chooseAnotherItem()"
});
formatter.result({
  "duration": 23537280857,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.id: huc-v2-button-view-cart-announce\u0027 (tried for 5 second(s) with 200 MILLISECONDS interval)\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Denys-PC\u0027, ip: \u0027169.254.203.50\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:296)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:265)\r\n\tat utils.WaitUtils.waitForElementForWebElem(WaitUtils.java:18)\r\n\tat pages.ChooseSecondItemFromList.addtoCartAnotherItem(ChooseSecondItemFromList.java:33)\r\n\tat stepDefinition.BDDScenarios.chooseAnotherItem(BDDScenarios.java:62)\r\n\tat ✽.And Type second item choose from list and add it to cart(referenceBDD.feature:10)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"huc-v2-button-view-cart-announce\"}\n  (Session info: chrome\u003d55.0.2883.87)\n  (Driver info: chromedriver\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 25 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Denys-PC\u0027, ip: \u0027169.254.203.50\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed), userDataDir\u003dC:\\Users\\Denys\\AppData\\Local\\Temp\\scoped_dir14964_7187}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d55.0.2883.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 289367a8776938087d3bc5f3fd0242b7\n*** Element info: {Using\u003did, value\u003dhuc-v2-button-view-cart-announce}\r\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:302)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:288)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:285)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat utils.WaitUtils.waitForElementForWebElem(WaitUtils.java:18)\r\n\tat pages.ChooseSecondItemFromList.addtoCartAnotherItem(ChooseSecondItemFromList.java:33)\r\n\tat stepDefinition.BDDScenarios.chooseAnotherItem(BDDScenarios.java:62)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:119)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "person-should-be-able-choose-and-by-phone-in-\"amazon\";login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Open chrome and get store site",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click link \"Account\u0026Lists\" ,I fill \"email\" with invalid data and \"password\"  with invalid data and click \"logIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Should be warning massage, something like \"You entered invalid login or password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDScenarios.open_chrome_and_get()"
});
formatter.result({
  "duration": 7886018738,
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
  "duration": 5958279263,
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
  "duration": 114783486,
  "status": "passed"
});
});