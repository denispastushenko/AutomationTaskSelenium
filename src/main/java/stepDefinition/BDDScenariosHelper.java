package stepDefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.*;

import static pages.Page.getDriver;
import static utils.WebdriverUtils.createDriver;

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
        startPage = new StartPage(createDriver());
        getDriver().manage().window().maximize();
    }


    @After
    public void tearDown() throws Exception {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

}
