package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarCheckPage extends Page {

    private static Set<String> resultSet = new HashSet<>();
    private static final int timeToScroll = 2000;

    @FindBy(xpath = "//div/h2")
    private List<WebElement> topAnnouncement;


    CarCheckPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CheckMatchesPageCar checkMatches() {
        addCollRes();
        Assert.assertEquals("Is top of list present", true, resultSet.contains("Топ-оголошення"));
        return new CheckMatchesPageCar(driver.get());
    }

    public CheckMatchesPageCar scroll (int scrollStep , int increment) {
        int SCROLL = scrollStep;
        long curTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - curTime < timeToScroll) {
            ((JavascriptExecutor) getDriver())
                    .executeScript(String
                            .format("scrollBy(0, %d)", SCROLL += increment));
        }
        return new CheckMatchesPageCar(driver.get());
    }

    private void addCollRes() {
        topAnnouncement.stream()
                .map((WebElement::getText))
                .forEach(resultSet::add);

    }

}
