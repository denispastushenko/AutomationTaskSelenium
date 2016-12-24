package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Page {

    public WebElement getLinkSignIn() {
        return linkSignIn;
    }

    @FindBy(id = "nav-link-accountList")
    private WebElement linkSignIn;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage autorisation() {
        getDriver().findElement(By.id("nav-link-accountList")).click();
        return new SignInPage(getDriver());
    }
}
