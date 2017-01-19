package pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CheckCurrentContentBodyPage extends Page {

    @FindBy(id = "publicshowmaildivcontent")
    private WebElement frame;

    @FindBy(xpath = "//body")
    private WebElement body;

    private static final String letterBody = "Hello, Denys.)";

    CheckCurrentContentBodyPage(WebDriver driver) {
        super(driver);
    }

    private static void waitForBodyTextLoad() {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void letterContextCheckAssert() {
        waitForBodyTextLoad();
        getDriver().switchTo().frame(frame);
        Assert.assertTrue(body.getText().startsWith(letterBody),"Letter body  is not empty");
        getDriver().switchTo().defaultContent();
    }
}
