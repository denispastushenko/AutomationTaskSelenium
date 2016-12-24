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

    static ChooseItem chooseItem = new ChooseItem(getDriver());

   public static final String firstItemLinkText = "Samsung Galaxy S7 Factory Unlocked Phone 32 GB - Internationally Sourced (Middle East/African/Asia/EU/LATAM) Version G930F- Titanium Silver";
    public static final String secondItemLinkText = "Apple iPhone 7 Plus 4G LTE Unlocked GSM Quad Core Smartphone w/ 12MP Camera (US Version) Jet Black";

    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    private List<WebElement> checkCartItems;

    public CheckCart(WebDriver driver) {
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

    public  void getElements() {
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
    }

}
