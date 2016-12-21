package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.ActionsUtils.actionClick;

public class StartPage extends  Page {

	@FindBy(id="nav-link-accountList")
	private WebElement linkSignIn;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage autorisation(){
        actionClick(linkSignIn);
        return new SignInPage(getdriver());
    }
}
