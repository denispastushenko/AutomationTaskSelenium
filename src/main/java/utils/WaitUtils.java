package utils;

import java.util.concurrent.TimeUnit;

import static pages.Page.getDriver;


public class WaitUtils {
    public static void  waitFor() {
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }



}

