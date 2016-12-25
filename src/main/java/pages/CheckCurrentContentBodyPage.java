package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class CheckCurrentContentBodyPage extends Page {

    private static final By body = By.xpath("//body");

    private static final String letterBody = "Hello, Denys.)\n" +
            "\n" +
            "-- реклама -----------------------------------------------------------\n" +
            "Поторопись зарегистрировать самый короткий почтовый адрес @i.ua\n" +
            "http://mail.i.ua/reg - и получи 1Gb для хранения писем";


    CheckCurrentContentBodyPage(WebDriver driver) {
        super(driver);
    }

    private static void waitForBodyTextLoad() {
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void letterContextCheckAssert() {
        waitForBodyTextLoad();
        getDriver().switchTo().frame("publicshowmaildivcontent");
        assertEquals(getDriver().findElement(body).getText(), letterBody);
        getDriver().switchTo().defaultContent();
    }
}
