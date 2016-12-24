package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseItemFromList extends Page {

static     ChooseItemFromList addToCart = new ChooseItemFromList(getDriver());

    @FindBy(xpath = "//div[@class='a-row a-spacing-none']/a")
    private List<WebElement> chooseProduct;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartItem;


    WebElement getAddToCartItem() {
        return addToCartItem;
    }

    public ChooseItemFromList(WebDriver driver) {
        super(driver);
    }

    public ChooseSecondItem addtoCartItem() {
        waitForElementForWebElem(chooseProduct.get(0), 5);
        chooseProduct.get(0).click();
        addToCart.getAddToCartItem().click();


        return new ChooseSecondItem(getDriver());

    }
}
