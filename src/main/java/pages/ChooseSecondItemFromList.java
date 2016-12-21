package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseSecondItemFromList extends Page {

    private static List<Integer> amountCartLast = new ArrayList<>();

    static ChooseItemFromList addToCart = new ChooseItemFromList(getdriver());

    private ChooseItem choose = new ChooseItem(getdriver());

    @FindBy(xpath = "//a[@title='Samsung Galaxy S7 Edge Factory Unlocked GSM 4G LTE Smartphone - Titanium Silver']")
    private WebElement chooseSecondItem;

    @FindBy(id = "huc-v2-button-view-cart-announce")
    private WebElement goToCart;

    ChooseSecondItemFromList(WebDriver driver) {
        super(driver);
    }

    public CheckCart addtoCartAnotherItem() throws AWTException {
        waitForElementForWebElem(chooseSecondItem, 5);
        chooseSecondItem.click();
        addToCart.getAddToCartItem().click();
        waitForElementForWebElem(goToCart, 5);
        goToCart.click();
        return new CheckCart(getdriver());
    }

    private void amountMethod() {
        amountCartLast.add(choose.cartAmount);
    }

    public int getSecondAmount() {
        amountMethod();
        return amountCartLast.get(0);
    }
}
