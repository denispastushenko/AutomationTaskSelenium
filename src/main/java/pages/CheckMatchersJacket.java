package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.WaitUtils;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class CheckMatchersJacket extends Page {
    private static List<String> resultSetJacket = new ArrayList<>();
    private By waitingForElem = By.id("topLoginLink");

    @FindBy(xpath = "//div//h3[@class='x-large lheight20 margintop5']/a/descendant::strong")
    private List<WebElement> getValueJacket;

    public CheckMatchersJacket(WebDriver webDriver) {
        super(webDriver);
    }

    public FormCheck checkForms() throws AWTException {
        enterPress();
        WaitUtils.waitForElementBy(waitingForElem, 3);
        addCollResJacket();
        Assert.assertNotEquals(CheckMatchesPageCar.resultSetCar.get(0), resultSetJacket.get(0));
        Assert.assertNotEquals(CheckMatchesPageCar.resultSetCar.get(1), resultSetJacket.get(1));
        return new FormCheck(driver.get());
    }

    private void addCollResJacket() {
        getValueJacket.stream()
                .map((WebElement::getText))
                .forEach(resultSetJacket::add);
        System.out.println(resultSetJacket);
    }

    private void enterPress() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}

