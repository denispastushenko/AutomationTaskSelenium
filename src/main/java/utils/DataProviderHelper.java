package utils;

import org.testng.annotations.DataProvider;

public class DataProviderHelper {
    @DataProvider(name = "Links")
    public static Object[][]Parameter() {
        Object detail[][];
        detail = new Object[1][2];
        detail[0][0]="http://www.i.ua/";
        detail[0][1]="https://www.mailinator.com/";
        return detail;
    }
}
