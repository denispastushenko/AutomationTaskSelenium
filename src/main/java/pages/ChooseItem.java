package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static utils.WaitUtils.waitForElementForWebElem;

public class ChooseItem extends Page {

    private static List<Integer> amountCartFirst = new ArrayList<>();

    @FindBy(xpath = "//div/a[@id='nav-link-accountList']/span[@class='nav-line-1']")
    private WebElement logInAssert;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement itemsAmount;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement findElementFIeld;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchButton;

    public ChooseItem(WebDriver driver) {
        super(driver);
    }

    public WebElement getItemsAmount() {
        return itemsAmount;
    }

    public WebElement getFindElementFIeld() {
        return findElementFIeld;
    }

    WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getLogInAssert() {
        return logInAssert;
    }

    public ChooseItemFromList chooseItemFrom(String item, WebElement webElement) {
        amountCartFirst.add(Integer.parseInt(getItemsAmount().getText()));
        waitForElementForWebElem(webElement, 5);
        findElementFIeld.sendKeys(item);
        searchButton.click();
        return new ChooseItemFromList(getDriver());
    }

    public int getAmount() {
        return amountCartFirst.get(0);
    }
}
