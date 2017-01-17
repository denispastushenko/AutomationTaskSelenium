package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static utils.WaitUtils.waitFor;

public class CheckMatchersJacket extends Page {
    private static List<String> resultSetJacket = new ArrayList<>();
    private By waitingForElem = By.id("topLoginLink");

    @FindBy(xpath = "//div//h3[@class='x-large lheight20 margintop5']/a/descendant::strong")
    private List<WebElement> getValueJacket;

    public CheckMatchersJacket(WebDriver webDriver) {
        super(webDriver);
    }

    public FormCheck checkForms() throws AWTException, InterruptedException {
        enterPress();
        waitFor();
        addCollResJacket();
        waitFor();
        Assert.assertNotEquals("Goods from different categories is not the same ",
                CheckMatchesPageCar.resultSetCar.get(0), resultSetJacket.get(0));
        Assert.assertNotEquals("Goods from different categories is not the same ",
                CheckMatchesPageCar.resultSetCar.get(1), resultSetJacket.get(1));
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

