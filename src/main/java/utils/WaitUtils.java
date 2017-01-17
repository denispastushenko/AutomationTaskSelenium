package utils;

import pages.Page;

import java.util.concurrent.TimeUnit;


public class WaitUtils {
    public static void  waitFor() {
        Page.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }



}

