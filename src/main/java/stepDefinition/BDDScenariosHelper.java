package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static pages.Page.getDriver;


class BDDScenariosHelper {
    protected static final String SITE = "https://www.amazon.com/";
    protected StartPage startPage;
    protected SignInPage signInPage;
    protected ChooseItem chooseItem;
    protected ChooseItemFromList chooseItemFromList;
    protected ChooseSecondItem chooseSecondItem;
    protected ChooseSecondItemFromList chooseSecondItemFromList;
    protected CheckCart checkCart;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\remoteDriverUtils\\chromedriver.exe");
        startPage = new StartPage(new ChromeDriver());
        getDriver().manage().window().maximize();
    }


    @After
    public void tearDown() throws Exception {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

}
