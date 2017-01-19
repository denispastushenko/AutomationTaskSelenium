import liseners.TestLogListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import static utils.WebdriverUtils.createDriver;


@Listeners(TestLogListener.class)
public class BeforeTest {

    protected static final String SITE = "http://www.i.ua/";
    protected LoginPage loginPage;
    protected SentMailPage sentMailPage;
    protected ComposeLinkPageClick composeLinkPageClick;
    protected CheckMailClickPage checkMailClickPage;

    @BeforeMethod
    public void setUp() throws Exception {
        loginPage = new LoginPage(createDriver());
        Page.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (Page.getDriver() != null) {
            Page.getDriver().quit();
        }
    }


}
