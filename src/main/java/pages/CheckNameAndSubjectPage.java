package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class CheckNameAndSubjectPage extends  Page {

    @FindBy(xpath = "//div[@title='FROM:']/div")
   public List<WebElement> fromWhoName;

    @FindBy(xpath = "//div[@class='innermail ng-binding']")
    public List<WebElement> letterSubject;

    CheckNameAndSubjectPage(WebDriver driver) {
        super(driver);
    }

    public CheckCurrentContentBodyPage clickOnLetter(){
        waitForElementForWebElem(fromWhoName.get(0),5);
        fromWhoName.get(0).click();
        return new CheckCurrentContentBodyPage(Page.getDriver());
    }

}
