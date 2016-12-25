package pages;

import org.openqa.selenium.WebDriver;

public class ChooseSecondItem extends Page {

    public ChooseSecondItem(WebDriver driver) {
        super(driver);
    }
 ChooseItem chooseItem = new ChooseItem(getDriver());
    public ChooseSecondItemFromList chooseSecondItemFrom(String item2) {
        chooseItem.getFindElementFIeld().sendKeys(item2);
        chooseItem.getSearchButton().click();
        return new ChooseSecondItemFromList(getDriver());
    }


}
