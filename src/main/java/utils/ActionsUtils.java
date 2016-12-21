package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pages.Page.getdriver;


public class ActionsUtils {
    private static Actions action = new Actions(getdriver());

    public static void actionClick(WebElement actionClick) {
        action.click(actionClick).build().perform();
    }
    public static void sendKeysMethod(WebElement send, String sendKeys) {
        send.sendKeys(sendKeys);
    }



}
