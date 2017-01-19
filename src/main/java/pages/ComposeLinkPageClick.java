package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaitUtils.waitForElementForWebElem;

public class ComposeLinkPageClick extends Page {
    
    @FindBy(xpath = "//p[@class='make_message']")
    private WebElement composeLetterLink;

    ComposeLinkPageClick(WebDriver driver) {
        super(driver);
    }

    public SentMailPage composeLink() {
        waitForElementForWebElem(composeLetterLink,5);
        composeLetterLink.click();
        return new SentMailPage(getDriver());
    }


}
