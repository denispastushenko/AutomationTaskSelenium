package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    private static ThreadLocal<WebDriver> webDriver = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    Page(WebDriver driver) {
        webDriver.set(driver);
        PageFactory.initElements(webDriver.get(), this);
    }
}
