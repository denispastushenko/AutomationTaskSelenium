import listeners.TestLogListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.*;

import static utils.WebdriverUtils.createDriver;

@Listeners(TestLogListener.class)
public class BeforeTestTest {

    protected static final String SITE = "https://www.amazon.com/";
    protected StartPage startPage;
    protected SignInPage signInPage;
    protected ChooseItem chooseItem;
    protected ChooseItemFromList chooseItemFromList;
    protected ChooseSecondItem chooseSecondItem;
    protected ChooseSecondItemFromList chooseSecondItemFromList;
    protected CheckCart checkCart;

    @BeforeTest
    public void setUp() throws Exception {
        startPage = new StartPage(createDriver());
        Page.getdriver().manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws Exception {
        if (Page.getdriver() != null) {
            Page.getdriver().quit();
        }
    }



}
