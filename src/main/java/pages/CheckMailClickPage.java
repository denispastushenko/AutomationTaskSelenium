package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class CheckMailClickPage extends Page {

    @FindBy(id = "newMail")
    private WebElement letters;

    @FindBy(xpath = "//span[@class='sbj']")
    private List<WebElement> checkSubject;


    CheckMailClickPage(WebDriver driver) {
        super(driver);
    }

    public String getCheckSubjectMethod() {
       return checkSubject
                .stream()
                .map(WebElement::getText)
                .findFirst()
                .get();
    }

    public CheckMailClickPage checkIsMailSent() {
        waitForElementForWebElem(letters,5);
        letters.click();
        return new CheckMailClickPage(getDriver());
    }
}
