package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Page {

    @FindBy(id = "nav-link-accountList")
    private WebElement linkSignIn;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage autorisation() {
        linkSignIn.click();
        return new SignInPage(getDriver());
    }
}
