package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebdriverUtils {
    public static DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

    public static WebDriver createDriver() {
        try {
            return new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),desiredCapabilities);

        } catch (MalformedURLException e) {
            throw new RuntimeException("Driver cannot be created!");
        }
    }
}
