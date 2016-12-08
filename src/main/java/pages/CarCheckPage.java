package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarCheckPage extends Page {
    private static Set<String> resultSet = new HashSet<>();

    @FindBy(xpath = "//div/h2")
    private List<WebElement> topAnnouncement;


    public CarCheckPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CheckMatchesPageCar checkMatches() {
        addCollRes();
        Assert.assertEquals(resultSet.contains("Топ-оголошення"), true);
        Assert.assertEquals(driver.get().getCurrentUrl(),
                "https://www.olx.ua/uk/list/q-%D0%90%D0%B2%D1%82%D0%BE%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D0%B8/");
        return new CheckMatchesPageCar(driver.get());
    }

    private void addCollRes() {
        topAnnouncement.stream()
                .map((WebElement::getText))
                .forEach(resultSet::add);

    }

}
