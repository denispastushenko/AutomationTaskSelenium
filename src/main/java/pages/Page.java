package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public Page(WebDriver driver) {
        webDriver.set(driver);
        PageFactory.initElements(webDriver.get(), this);
    }

}
