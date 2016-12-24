package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pages.Page;

import java.util.concurrent.TimeUnit;

public class WaitUtils {

    public static WebElement waitForElementForWebElem(WebElement add, int timeOutInSeconds) {
        return new FluentWait<>(Page.getDriver())
                .withTimeout(timeOutInSeconds, TimeUnit.SECONDS)
                .pollingEvery(200, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(add));
    }
}

