import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

public class MainSendMailTest extends BeforeTest {

    @Test
    public void validUserLoginTest() throws Exception {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", "123456789aB");
        Assert.assertEquals("denysPastushenko@i.ua",loginPage.getSuccLogin().getText(),"Check is login was success");
    }

    @Test
    public void invalidUserLoginTest() throws Exception {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPas", "129aB");
        Assert.assertEquals("Неверный логин или пароль",loginPage.getWarningIncorrectLoginOrPass().getText(),"Incorrect login or password");
    }

    @Test
    public void sentMailTest() throws Exception {
        Page.getDriver().get(SITE);
        composeLinkPageClick = loginPage.loginMethod("denysPastushenko", "123456789aB");
        sentMailPage = composeLinkPageClick.composeLink();
        checkMailClickPage = sentMailPage.sentMail("denysPastushenko@i.ua","subjectExample","Hello, Denys.)");
        checkMailClickPage.checkIsMailSent();
        Assert.assertEquals("subjectExample",checkMailClickPage.getCheckSubjectMethod(),"Check is mail was sent");


    }


}
