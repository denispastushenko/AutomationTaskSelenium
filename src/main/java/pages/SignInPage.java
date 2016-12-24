package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitUtils.waitForElementForWebElem;

public class SignInPage extends  Page {

	@FindBy(id="ap_email")
	private WebElement loginField;

    @FindBy(id="ap_password")
    private WebElement passField;

    @FindBy(id="signInSubmit")
    private WebElement loginButton;


    public SignInPage(WebDriver driver) {super(driver);}
    public ChooseItem logIn(String login, String password){
        waitForElementForWebElem(loginField, 5);
        loginField.sendKeys(login);
        passField.sendKeys(password);
        loginButton.click();
        return new ChooseItem(getDriver());
    }
}
