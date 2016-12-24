import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static pages.CheckCart.*;
import static pages.Page.getDriver;
import static utils.LanguageCheckClass.setMainGreeting;

public class MainTestSignInTest extends BaseTest {

    @Test
    public void checkThatUserCanLoginWithCorrectCredentialsTest() {
        getDriver().get(SITE);
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn("dpastushenko1996@gmail.com", "1996baba");
        Assert.assertEquals("Hello, Denys",setMainGreeting(chooseItem.getLogInAssert().getText()) + "Denys");
    }

    @Test
    public void checkThatUserCanNotLoginWithInvalidCredentialsTest() {
        getDriver().get(SITE);
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn("svnjmvcskm", "jasbcjnbs");
        Assert.assertEquals(isElementPresent(getDriver(), By.xpath("//span[@class='a-list-item']")), true);
    }
    @Test
    public void userCanBySomeStaffTest() {
        getDriver().get(SITE);
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn("dpastushenko1996@gmail.com", "1996baba");
        chooseItemFromList = chooseItem.chooseItemFrom("Apple iPhone 7 Unlocked Phone",chooseItem.getFindElementFIeld());
        chooseSecondItem = chooseItemFromList.addtoCartItem();
        chooseSecondItemFromList = chooseSecondItem.chooseSecondItemFrom("samsung galaxy s7");
        checkCart = chooseSecondItemFromList.addtoCartAnotherItem();
        Assert.assertEquals(isElementPresent(getDriver(), new By.ByLinkText(firstItemLinkText)), true);
        checkCart.getElements();
        Assert.assertEquals(isElementPresent(getDriver(), new By.ByLinkText(secondItemLinkText)), true);
        checkCart.elementAmountCheck();
        Assert.assertTrue(chooseSecondItemFromList.getSecondAmount() - chooseItem.getAmount() == 2);
        checkCart.explanation();
    }
}
