package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.*;

import java.awt.*;

import static pages.CheckCart.*;
import static pages.Page.getDriver;
import static utils.LanguageCheckClass.setMainGreeting;
import static utils.WebdriverUtils.createDriver;

public class BDDScenarios {
    public static final String SITE = "https://www.amazon.com/";
    public StartPage startPage;



    @Given("^Open chrome and get store site$")
    public void open_chrome_and_get() throws Throwable {
        startPage = new StartPage(createDriver());
        getDriver().manage().window().maximize();
        getDriver().get(SITE);
    }





    @When("^I click link \"([^\"]*)\" ,I fill \"([^\"]*)\" with valid data and \"([^\"]*)\"  with valid data and click \"([^\"]*)\" button$")
    public void ligIn(String string, String string1, String string2, String string3) {
        StartPage startPage = new StartPage(getDriver());
        startPage.autorisation();
        SignInPage signInPage = new SignInPage(getDriver());
        signInPage.logIn("dpastushenko1996@gmail.com", "1996baba");
    }

    @When("^Login should be successful, I have \"([^\"]*)\" and greetings \"([^\"]*)\"\\.$")
    public void succLogin(String arg1, String arg2) {
        ChooseItem chooseItem = new ChooseItem(getDriver());
        Assert.assertEquals("Hello, Denys", setMainGreeting(chooseItem.getLogInAssert().getText()) + "Denys");
    }

    @When("^Type first item choose from list and add it to cart$")
    public void findFirstItem() throws AWTException {
        ChooseItem chooseItem = new ChooseItem(getDriver());
        ChooseItemFromList chooseItemFromList = new ChooseItemFromList(getDriver());
        chooseItem.chooseItemFrom("Apple iPhone 7 Unlocked Phone", chooseItem.getFindElementFIeld());
        chooseItemFromList.addtoCartItem();

    }

    @When("^Type second item choose from list and add it to cart$")
    public void chooseAnotherItem() throws AWTException {
        ChooseSecondItemFromList chooseSecondItemFromList = new ChooseSecondItemFromList(getDriver());
        ChooseSecondItem chooseSecondItem = new ChooseSecondItem(getDriver());
        chooseSecondItem.chooseSecondItemFrom("samsung galaxy s7");
        chooseSecondItemFromList.addtoCartAnotherItem();
    }


    @Then("^In cart should be (\\d+) new items \"([^\"]*)\" and \"([^\"]*)\"$")
    public void checkCart(Integer arg1, String arg2, String arg3) {
        ChooseSecondItemFromList chooseSecondItemFromList = new ChooseSecondItemFromList(getDriver());
        CheckCart checkCart = new CheckCart(getDriver());
        ChooseItem chooseItem = new ChooseItem(getDriver());
        Assert.assertEquals(isElementPresent(getDriver(), new By.ByLinkText(firstItemLinkText)), true);
        checkCart.getElements();
        Assert.assertEquals(isElementPresent(getDriver(), new By.ByLinkText(secondItemLinkText)), true);
        checkCart.elementAmountCheck();
        Assert.assertTrue(chooseSecondItemFromList.getSecondAmount() - chooseItem.getAmount() == 2);
        checkCart.explanation();

    }

    @When("^I click link \"([^\"]*)\" ,I fill \"([^\"]*)\" with invalid data and \"([^\"]*)\"  with invalid data and click \"([^\"]*)\" button$")
    public void typeInvalidCredentional(String arg1, String arg2, String arg3, String arg4) {
        startPage.autorisation();
        getDriver().findElement(By.id("ap_email")).sendKeys("dpastushenko1@gmail.com");
        getDriver().findElement(By.id("ap_password")).sendKeys("1996ba");
        getDriver().findElement(By.id("signInSubmit")).click();
    }



    @Then("^Should be warning massage, something like \"([^\"]*)\"$")
    public void invalidLogin(String arg1) {
        Assert.assertTrue( getDriver().findElement(By.xpath("//ul[@class= 'a-nostyle " +
                "a-vertical a-spacing-none']/li/span[@class='a-list-item']")).isDisplayed());


    }




}