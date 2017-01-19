package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseItemFromList extends Page {

    @FindBy(xpath = "//div[@class='a-row a-spacing-none']/a")
    private List<WebElement> chooseProduct;


    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartItem;

    public List<WebElement> getChooseProduct() {
        return chooseProduct;
    }

    WebElement getAddToCartItem() {
        return addToCartItem;
    }

    ChooseItemFromList(WebDriver driver) {
        super(driver);
    }

    public ChooseSecondItem addtoCartItem() {
        ChooseItemFromList addToCart = new ChooseItemFromList(getDriver());
        waitForElementForWebElem(chooseProduct.get(0), 5);
        chooseProduct.get(0).click();
        addToCart.getAddToCartItem().click();


        return new ChooseSecondItem(getDriver());

    }
}
