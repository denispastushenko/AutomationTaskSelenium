package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitUtils.waitForElementForWebElem;

public class MailinatorStartPage extends  Page {

    @FindBy(id = "inboxfield")
    private WebElement searchMailField;

    @FindBy(xpath = "//button[@class='btn btn-dark']")
    private WebElement goToMailButton;

    MailinatorStartPage(WebDriver driver) {
        super(driver);}

    private static   void getMailinatorPage(){
        getDriver().get("https://www.mailinator.com/");
    }

    public CheckNameAndSubjectPage searchLetterMethod(String userMailName){
        getMailinatorPage();
        waitForElementForWebElem(goToMailButton,5);
        searchMailField.sendKeys(userMailName);
        goToMailButton.click();
        return new CheckNameAndSubjectPage(getDriver());
    }
}
