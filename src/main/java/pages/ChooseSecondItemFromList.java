package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseSecondItemFromList extends Page {

    private static List<Integer> amountCartLast = new ArrayList<>();

    private ChooseItem choose = new ChooseItem(getDriver());


    @FindBy(xpath = "//div[@class='a-row a-spacing-none']/a")
    private List<WebElement> chooseSecondItem;

    @FindBy(id = "huc-v2-button-view-cart-announce")
    private WebElement goToCart;

    public ChooseSecondItemFromList(WebDriver driver) {
        super(driver);
    }

    public CheckCart addtoCartAnotherItem() {
        waitForElementForWebElem(chooseSecondItem.get(1), 5);
        chooseSecondItem.get(1).click();
        ChooseItemFromList addToCart = new ChooseItemFromList(getDriver());
        addToCart.getAddToCartItem().click();
        waitForElementForWebElem(goToCart, 5);
        goToCart.click();
        return new CheckCart(getDriver());
    }

    private void amountMethod() {
        amountCartLast.add(Integer.parseInt(choose.getItemsAmount().getText()));
    }

    public int getSecondAmount() {
        amountMethod();
        return amountCartLast.get(0);
    }
}
