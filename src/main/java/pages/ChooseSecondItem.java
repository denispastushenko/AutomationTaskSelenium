package pages;

import org.openqa.selenium.WebDriver;

import static pages.CheckCart.chooseItem;

public class ChooseSecondItem extends Page {

    public ChooseSecondItem(WebDriver driver) {
        super(driver);
    }

    public ChooseSecondItemFromList chooseSecondItemFrom(String item2) {
        chooseItem.getFindElementFIeld().sendKeys(item2);
        chooseItem.getSearchButton().click();
        return new ChooseSecondItemFromList(getDriver());
    }


}
