package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.ActionsUtils.actionClick;
import static utils.ActionsUtils.sendKeysMethod;
import static utils.WaitUtils.waitForElementForWebElem;

public class SignInPage extends  Page {

	@FindBy(id="ap_email")
	private WebElement loginField;

    @FindBy(id="ap_password")
    private WebElement passField;

    @FindBy(id="signInSubmit")
    private WebElement loginButton;

    SignInPage(WebDriver driver) {super(driver);}

    public ChooseItem logIn(String login, String password){
        waitForElementForWebElem(loginField, 5);
        sendKeysMethod(loginField,login);
        sendKeysMethod(passField,password);
        actionClick(loginButton);
        return new ChooseItem(getdriver());
    }
}
