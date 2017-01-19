package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.PropertyConfiguration;

import static pages.CheckCart.checkIsElementsPresent;
import static pages.CheckCart.isElementPresent;
import static pages.Page.getDriver;
import static utils.LanguageCheckClass.setMainGreeting;

public class BDDScenarios extends BDDScenariosHelper {

    @Given("^Open chrome and get store site$")
    public void open_chrome_and_get() {
        getDriver().get(SITE);
    }

    @When("^I click link \"([^\"]*)\" ,I fill \"([^\"]*)\" with valid data and \"([^\"]*)\"  with valid data and click \"([^\"]*)\" button$")
    public void ligIn(String string, String string1, String string2, String string3) {
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn(PropertyConfiguration.getInstance().getEmail(), PropertyConfiguration.getInstance().getPassword());
    }

    @When("^Login should be successful, I have \"([^\"]*)\" and greetings \"([^\"]*)\"\\.$")
    public void succLogin(String arg1, String arg2) {
        Assert.assertEquals("Hello, Denys", setMainGreeting(chooseItem.getLogInAssert().getText()) + "Denys", " Is success login");
    }

    @When("^Type first item choose from list and add it to cart$")
    public void findFirstItem() {
        chooseItemFromList = chooseItem.chooseItemFrom("Apple iPhone 7 Unlocked Phone", chooseItem.getFindElementFIeld());
        chooseSecondItem = chooseItemFromList.addtoCartItem();
    }

    @When("^Type second item choose from list and add it to cart$")
    public void chooseAnotherItem() {
        chooseSecondItemFromList = chooseSecondItem.chooseSecondItemFrom("samsung galaxy s7");
        checkCart = chooseSecondItemFromList.addtoCartAnotherItem();
    }


    @Then("^In cart should be (\\d+) new items \"([^\"]*)\" and \"([^\"]*)\"$")
    public void checkCart(Integer arg1, String arg2, String arg3) {
        Assert.assertEquals(true, isElementPresent(getDriver(), new By.ByXPath(checkIsElementsPresent)),
                "Check is goods already in the cart");
        checkCart.getElements();
        checkCart.elementAmountCheck();
        Assert.assertEquals(chooseSecondItemFromList.getSecondAmount() - chooseItem.getAmount(), 2);

        checkCart.explanation();
    }

    @When("^I click link \"([^\"]*)\" ,I fill \"([^\"]*)\" with invalid data and \"([^\"]*)\"  with invalid data and click \"([^\"]*)\" button$")
    public void typeInvalidCredential(String arg1, String arg2, String arg3, String arg4) {
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn(PropertyConfiguration.getInstance().getIncorrlogin(), PropertyConfiguration.getInstance().getIncorrpassword());
    }


    @Then("^Should be warning massage, something like \"([^\"]*)\"$")
    public void invalidLogin(String arg1) {
        Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class= 'a-nostyle " +
                        "a-vertical a-spacing-none']/li/span[@class='a-list-item']")).isDisplayed(),
                "You can not login with invalid data");
    }
}
