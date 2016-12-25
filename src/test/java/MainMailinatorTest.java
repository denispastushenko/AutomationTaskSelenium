import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

public class MainMailinatorTest extends  BaseTest {
    @Test
    public void sentMailTest() {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", "123456789aB");
        sentMailPage = composeLinkPageClick.composeLink();
        mailinatorStartPage = sentMailPage.sentMail("denyspastushenko@mailinator.com","subjectExample","Hello, Denys.)");
        Assert.assertTrue(sentMailPage.getConfirmationMessage().isDisplayed(),"Check is current mail was sent");
        checkNameAndSubjectPage = mailinatorStartPage.searchLetterMethod("denysPastushenko@i.ua");
        Assert.assertEquals(checkNameAndSubjectPage.fromWhoName.get(0).getText(), "Denys","Check is correct user name");
        Assert.assertEquals(checkNameAndSubjectPage.letterSubject.get(2).getText(), "subjectExample","Check is correct user name");
        checkCurrentContentBodyPage = checkNameAndSubjectPage.clickOnLetter();
        checkCurrentContentBodyPage.letterContextCheckAssert();

    }
}
