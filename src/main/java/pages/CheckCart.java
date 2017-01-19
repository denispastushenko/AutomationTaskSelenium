package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CheckCart extends Page {

    private static List<String> resultSet = new ArrayList<>();

    private ChooseSecondItemFromList chooseSecondAmountOfElement = new ChooseSecondItemFromList(getDriver());

    private ChooseItem chooseItem = new ChooseItem(getDriver());

    public static final String checkIsElementsPresent = "//span[@class='a-list-item']/a";

    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    private List<WebElement> checkCartItems;

    CheckCart(WebDriver driver) {
        super(driver);
    }

    public CheckCart elementAmountCheck() {
        if (chooseSecondAmountOfElement.getSecondAmount() - chooseItem.getAmount() == 1 ||
                chooseSecondAmountOfElement.getSecondAmount() - chooseItem.getAmount() == 0) {
            systemErrPrint();
        }
        return new CheckCart(getDriver());
    }

    public static boolean isElementPresent(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void getElements() {
        checkCartItems.stream()
                .map(WebElement::getText)
                .filter(title -> title.contains("Apple iPhone 7") || title.contains("Samsung Galaxy S7"))
                .forEach(item -> resultSet.add(item));
        System.out.println("Just Added Cart Items:");
        System.out.println(resultSet);
    }

    private void systemErrPrint() {
        System.err.println("Probably item what you want to chose does not exist in " +
                "'Amazon' store. Or you are out of bounds goods limit!!");
        System.err.println("Test not fully past? clean your cart and rerun tests again");
    }

    public void explanation() {
        System.out.println("First goods amount: " + chooseItem.getAmount());
        System.out.println("Second goods amount: " + chooseSecondAmountOfElement.getSecondAmount());
        System.err.println("Cart sgould be empty firstly, if not -- test can not be completely passed");
    }

}
