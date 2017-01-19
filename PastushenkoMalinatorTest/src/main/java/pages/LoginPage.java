package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitUtils.waitForElementForWebElem;

public class LoginPage extends Page {

    @FindBy(name = "login")
    private WebElement userEmail;

    @FindBy(name = "pass")
    private WebElement userPassword;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement buttonLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public ComposeLetterPage loginMethod(String email, String pass) {
        waitForElementForWebElem(userEmail,5);
        userEmail.sendKeys(email);
        userPassword.sendKeys(pass);
        buttonLogin.click();
        return new ComposeLetterPage(getDriver());
    }
}
