import listeners.TestLogListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import static utils.WebdriverUtils.createDriver;

@Listeners(TestLogListener.class)
public class BaseTest {

    public static final String SITE = "https://www.amazon.com/";
    protected StartPage startPage;
    protected SignInPage signInPage;
    protected ChooseItem chooseItem;
    protected ChooseItemFromList chooseItemFromList;
    protected ChooseSecondItem chooseSecondItem;
    protected ChooseSecondItemFromList chooseSecondItemFromList;
    protected CheckCart checkCart;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("-Dhudson.model.DirectoryBrowserSupport.CSP=default-src 'self'; script-src 'self' 'unsafe-inline' " +
                "'unsafe-eval'; style-src 'self' 'unsafe-inline';",
                "-Djenkins.model.DirectoryBrowserSupport.CSP=default-src 'self'; script-src" +
                " 'self' 'unsafe-inline' 'unsafe-eval'; style-src 'self' 'unsafe-inline';");
        startPage = new StartPage(createDriver());
        Page.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (Page.getDriver() != null) {
            Page.getDriver().quit();
        }
    }


}
