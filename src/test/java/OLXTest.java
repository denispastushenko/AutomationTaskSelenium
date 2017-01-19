import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

import static pages.CheckMatchersJacket.resultSetJacket;
import static pages.CheckMatchesPageCar.resultSetCar;

public class OLXTest extends BaseTest {

    @Test
    public void checkPopularRequestsTest() {
        Page.getDriver().get(SITE);
        carCheckPage = homePage.checkPopularRequests();

    }

    @Test
    public void CheckProfileTest() {
        Page.getDriver().get(SITE);
        Assert.assertEquals("Мой профиль", homePage.getCheckProfile().getText(), "Is my profile  present");
    }

    @Test
    public void CheckAutoIsPresentTest() {
        Page.getDriver().get(SITE);
        carCheckPage = homePage.checkLocationMethods("Автомобили");
    }

    @Test
    public void CheckPageTest() {
        Page.getDriver().get(SITE);
        carCheckPage = homePage.checkLocationMethods("Автомобили");
        checkMatchesPage = carCheckPage.checkMatches();
        Assert.assertEquals(Page.getDriver().getCurrentUrl(),
                "https://www.olx.ua/uk/list/q-%D0%90%D0%B2%D1%82%D0%BE%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D0%B8/"
                , "Is it first Page? ");
    }

    @Test
    public void CheckIsCategoryNotTheSameTest() {
        Page.getDriver().get(SITE);
        carCheckPage = homePage.checkLocationMethods("Автомобили");
        checkMatchesPage = carCheckPage.scroll(250, 250);
        checkMatchersJacket = checkMatchesPage.findAnotherCategory("Курточки");
        formCheck = checkMatchersJacket.checkForms();
        Assert.assertNotEquals("Goods from different categories is not the same ",
                resultSetCar.get(0), resultSetJacket.get(0));
        Assert.assertNotEquals("Goods from different categories is not the same ",
                resultSetCar.get(1), resultSetJacket.get(1));
    }


    @Test
    public void CheckFormValuesTest() {
        Page.getDriver().get(SITE);
        homePage.getMyProfile().checkFormWithIncorrectValues("блаблабла").checkFormValues();
    }
}
