package pages;

import org.openqa.selenium.WebDriver;

import static pages.CheckCart.chooseItem;
import static utils.ActionsUtils.sendKeysMethod;
import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseSecondItem extends Page {

    ChooseSecondItem(WebDriver driver) {
        super(driver);
    }

    public ChooseSecondItemFromList chooseSecondItemFrom(String item2) {
        waitForElementForWebElem(chooseItem.getFindElementFIeld(), 5);
        sendKeysMethod(chooseItem.getFindElementFIeld(), item2);
        chooseItem.getSearchButton().click();
        return new ChooseSecondItemFromList(getdriver());
    }


}
