import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

import static utils.Actions.pass;

public class MainSendMailTest extends BeforeTest {

    @Test
    public void validUserLoginTest() {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", pass());
        Assert.assertEquals("denysPastushenko@i.ua", loginPage.getSuccLogin().getText(), "Check is login was success");
    }

    @Test
    public void invalidUserLoginTest() {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPas", "129aB");
        Assert.assertEquals("Неверный логин или пароль", loginPage.getWarningIncorrectLoginOrPass().getText(),
                "Incorrect login or password");
    }

    @Test
    public void IsMailSentTest() {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", pass());
        sentMailPage = composeLinkPageClick.composeLink();
        checkMailClickPage = sentMailPage.sentMail("denysPastushenko@i.ua", "subjectExample", "Hello, Denys.)");
        Assert.assertTrue(sentMailPage.getConfirmationMessage().isDisplayed());
        checkMailClickPage.isMailSent();
    }

    @Test(dependsOnMethods = "IsMailSentTest")
    public void IsRightSubjectPresentTest() {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", pass());
        sentMailPage = composeLinkPageClick.composeLink();
        checkMailClickPage = sentMailPage.sentMail("denysPastushenko@i.ua", "subjectExample", "Hello, Denys.)");
        checkMailClickPage.isMailSent();
        Assert.assertEquals(checkMailClickPage.getCheckSubjectMethod(), "subjectExample", "Check is mail was sent");
    }
}
