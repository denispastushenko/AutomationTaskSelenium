package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static utils.WaitUtils.waitFor;

public class CheckMatchersJacket extends Page {

    public static List<String> resultSetJacket = new ArrayList<>();

    @FindBy(xpath = "//div//h3[@class='x-large lheight20 margintop5']/a/descendant::strong")
    private List<WebElement> getValueJacket;

    CheckMatchersJacket(WebDriver webDriver) {
        super(webDriver);
    }

    public FormCheck checkForms(){
        enterPress();
        waitFor();
        addCollResJacket();
        waitFor();
        return new FormCheck(driver.get());
    }

    private void addCollResJacket() {
        getValueJacket.stream()
                .map((WebElement::getText))
                .forEach(resultSetJacket::add);
        System.out.println(resultSetJacket);
    }

    private void enterPress(){
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        if (robot != null) {
            robot.keyPress(KeyEvent.VK_ENTER);
        }
    }
}

