package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HomePage extends Page {

    private static Set<String> resultSet = new HashSet<>();

    @FindBy(xpath = "//div/h3")
    private List<WebElement> checkPopularSearch;

    @FindBy(id = "topLoginLink")
    private WebElement checkProfile;

    @FindBy(id = "changeLang")
    private WebElement switchLanguage;

    @FindBy(id = "headerSearch")
    private WebElement carSearch;

    @FindBy(id = "submit-searchmain")
    private WebElement btnCarSearch;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public CarCheckPage checkValuesMethods(String value) {
        addCollRes();
        Assert.assertEquals(resultSet.toString(), "[Популярные запросы:]");
        Assert.assertEquals(checkProfile.getText(), "Мой профиль");
        switchLanguage.click();
        Assert.assertEquals(driver.get().getCurrentUrl(),"https://www.olx.ua/uk/");
        carSearch.sendKeys(value);
        btnCarSearch.click();
        return new CarCheckPage(driver.get());

    }

    private void addCollRes() {
        checkPopularSearch.stream()
                .map((WebElement::getText))
                .filter(result -> result.contains("Популярные запросы:"))
                .forEach(resultSet::add);

    }

}
