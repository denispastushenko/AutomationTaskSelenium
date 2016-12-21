import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static pages.CheckCart.*;
import static pages.Page.getdriver;
import static utils.LanguageCheckClass.setMainGreeting;

public class MainTestSignInTest extends BeforeTestTest {

    @Test
    public void accountListsClick() throws AWTException {
        getdriver().get(SITE);
        signInPage = startPage.autorisation();
        chooseItem = signInPage.logIn("dpastushenko1996@gmail.com", "1996baba");
        Assert.assertEquals("Hello, Denys",setMainGreeting(chooseItem.getLogInAssert().getText()) + "Denys");
        chooseItemFromList = chooseItem.chooseItemFrom("Apple iPhone 7 Unlocked Phone",chooseItem.getFindElementFIeld());
        chooseSecondItem = chooseItemFromList.addtoCartItem();
        chooseSecondItemFromList = chooseSecondItem.chooseSecondItemFrom("samsung galaxy s7 edge");
        checkCart = chooseSecondItemFromList.addtoCartAnotherItem();
        Assert.assertEquals(isElementPresent(getdriver(), new By.ByLinkText(firstItemLinkText)), true);
        checkCart.getElements();
        Assert.assertEquals(isElementPresent(getdriver(), new By.ByLinkText(secondItemLinkText)), true);
        checkCart.elementAmountCheck();
        Assert.assertTrue(chooseSecondItemFromList.getSecondAmount() - chooseItem.getAmount() == 2);
        checkCart.explanation();
    }
}
