package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitUtils.waitForElementForWebElem;

public class SentMailPage extends Page {
    @FindBy(id = "to")
    private WebElement fromWhom;

    @FindBy(name = "subject")
    private WebElement subject;

    @FindBy(id = "text")
    private WebElement textBody;

    @FindBy(xpath = "//p[@class='send_container']/input[@name='send']")
    private WebElement sentButton;

    @FindBy(xpath = "//div[@class='content clear']")
    private WebElement confirmationMessage;

    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }

    public SentMailPage(WebDriver driver) {
        super(driver);
    }


    public CheckMailClickPage sentMail(String fromwho, String subj, String textBody_) {
        waitForElementForWebElem(fromWhom, 5);
        fromWhom.sendKeys(fromwho);
        subject.sendKeys(subj);
        textBody.sendKeys(textBody_);
        sentButton.click();
        return new CheckMailClickPage(getDriver());
    }
}
