package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

import static pages.ChooseSecondItemFromList.addToCart;
import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseItemFromList extends Page {

    @FindBy(xpath = "//a[@title='Apple iPhone 7 Plus 4G LTE Unlocked GSM Quad Core Smartphone w/ 12MP Camera (US Version) Jet Black']")
    private WebElement chooseProduct;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartItem;


    WebElement getAddToCartItem() {
        return addToCartItem;
    }

    ChooseItemFromList(WebDriver driver) {
        super(driver);
    }

    public ChooseSecondItem addtoCartItem() throws AWTException {
        waitForElementForWebElem(chooseProduct, 5);
        chooseProduct.click();
        addToCart.getAddToCartItem().click();


        return new ChooseSecondItem(getdriver());

    }
}
