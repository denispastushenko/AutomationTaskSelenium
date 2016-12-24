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

    @FindBy(xpath = "//div[@class='content clear']")
    private WebElement warningIncorrectLoginOrPass;

    @FindBy(xpath="//span[@class='sn_menu_title']")
    private WebElement succLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    LoginPage() {
        this(Page.getDriver());
    }

    public WebElement getWarningIncorrectLoginOrPass() {
        return warningIncorrectLoginOrPass;
    }

    public WebElement getSuccLogin() {
        return succLogin;
    }



    public ComposeLinkPageClick loginMethod(String email, String pass) {
        waitForElementForWebElem(userEmail,5);
        userEmail.sendKeys(email);
        userPassword.sendKeys(pass);
        buttonLogin.click();
        return new ComposeLinkPageClick(getDriver());
    }
}
