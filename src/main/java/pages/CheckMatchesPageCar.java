package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CheckMatchesPageCar extends Page {

    static List<String> resultSetCar = new ArrayList<>();

    @FindBy(xpath = "//div//h3[@class='x-large lheight20 margintop5']/a/descendant::strong")
    private List<WebElement> getValueCar;

    @FindBy(id = "clearQ")
    private WebElement clearField;

    @FindBy(id = "search-text")
    private WebElement typeAnotherCategory;


    CheckMatchesPageCar(WebDriver webDriver) {
        super(webDriver);
    }

    public CheckMatchersJacket findAnotherCategory(String category) {
        addCollResCar();
        clearField.click();
        typeAnotherCategory.sendKeys(category);
        return new CheckMatchersJacket(driver.get());
    }

    private void addCollResCar() {
        getValueCar.stream()
                .map((WebElement::getText))
                .forEach(resultSetCar::add);
        System.out.println(resultSetCar);
    }
}

