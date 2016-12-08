import org.testng.annotations.Test;
import pages.Page;

public class OLXTest extends  BaseTest {

    @Test
    public void OlxTest() throws Exception {
        Page.getDriver().get(SITE);
        carCheckPage = homePage.checkValuesMethods("Автомобили");
        checkMatchesPage = carCheckPage.checkMatches();
        checkMatchersJacket = checkMatchesPage.checkMatch("Курточки");
        formCheck = checkMatchersJacket.checkForms();
        formCheck =formCheck.checkFormValues("блаблабла");
    }


}
