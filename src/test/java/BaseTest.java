import liseners.TestLogListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import java.lang.reflect.Method;

@Listeners(TestLogListener.class)
public class BaseTest {
    public static final String SITE = "http://olx.ua";
    protected HomePage homePage;
    protected CarCheckPage carCheckPage;
    protected CheckMatchesPageCar checkMatchesPage;
    protected CheckMatchersJacket checkMatchersJacket;
    protected FormCheck formCheck;


    @BeforeMethod
    public void setUp(Method method) {
        homePage = new HomePage(new ChromeDriver());
        Page.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public void shoutDown() {
        if (Page.getDriver() != null) {
            Page.getDriver().quit();
        }
    }
}
