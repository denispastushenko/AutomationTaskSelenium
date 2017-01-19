import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utils.DataProviderHelper;

import static pages.MailinatorStartPage.*;
import static utils.Actions.*;

public class MainMailinatorTest extends BaseTest {
    @Test
    public void isMailSentTest() {
        Page.getDriver().get(SITE);
        composeLetterPage = loginPage.loginMethod("denysPastushenko", getPassword());
        sentMailPage = composeLetterPage.composeLink();
        mailinatorStartPage = sentMailPage.sentMail("denyspastushenko@mailinator.com", "subjectExample", "Hello, Denys.)");
        Assert.assertTrue(sentMailPage.getConfirmationMessage().isDisplayed(), "Check is current mail was sent");
    }

    @Test(dataProviderClass = DataProviderHelper.class, dataProvider = "Links", dependsOnMethods = "isMailSentTest")
    public void sentMailMalilinatorTest(String IuaLink, String mailinatorLink) {
        Page.getDriver().get(IuaLink);
        composeLetterPage = loginPage.loginMethod("denysPastushenko", getPassword());
        sentMailPage = composeLetterPage.composeLink();
        mailinatorStartPage = sentMailPage.sentMail("denyspastushenko@mailinator.com", "subjectExample", "Hello, Denys.)");
        getMailinatorPage(mailinatorLink);
        checkNameAndSubjectPage = mailinatorStartPage.searchLetterMethod("denysPastushenko@i.ua");
        Assert.assertEquals(checkNameAndSubjectPage.fromWhoName.get(0).getText(), "Denys", "Check is it correct user name");
        Assert.assertEquals(checkNameAndSubjectPage.letterSubject.get(2).getText(), "subjectExample", "Check is it correct user name");
    }

    @Test(dataProviderClass = DataProviderHelper.class, dataProvider = "Links", dependsOnMethods = "sentMailMalilinatorTest")
    public void sentMailTest(String IuaLink, String mailinatorLink) {
        Page.getDriver().get(IuaLink);
        composeLetterPage = loginPage.loginMethod("denysPastushenko", getPassword());
        sentMailPage = composeLetterPage.composeLink();
        mailinatorStartPage = sentMailPage.sentMail("denyspastushenko@mailinator.com", "subjectExample", "Hello, Denys.)");
        getMailinatorPage(mailinatorLink);
        checkNameAndSubjectPage = mailinatorStartPage.searchLetterMethod("denysPastushenko@i.ua");
        checkCurrentContentBodyPage = checkNameAndSubjectPage.clickOnLetter();
        checkCurrentContentBodyPage.letterContextCheckAssert();

    }

}
