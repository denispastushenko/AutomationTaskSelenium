package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormCheck extends Page {

    private HomePage home = new HomePage(getDriver());

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(id = "userPass")
    private WebElement userPass;

    @FindBy(id = "checkbox_user-remember")
    private WebElement checkbox;

    @FindBy(xpath = "//div//button[@id='se_userLogin']")
    private WebElement userLogin;

    @FindBy(xpath = "//div//label")
    private WebElement mess;


    FormCheck(WebDriver webDriver) {
        super(webDriver);
    }

    public FormCheck checkFormValues() {
        home.getCheckProfile().click();
        Assert.assertEquals("", userEmail.getText());
        Assert.assertEquals("", userPass.getText());
        Assert.assertTrue("Is check Box selected", checkbox.isSelected());
        return new FormCheck(driver.get());
    }

    public FormCheck checkFormWithIncorrectValues(String value) {
        home.getCheckProfile().click();
        userEmail.sendKeys(value);
        userLogin.click();
        Assert.assertEquals("это не похоже на email-адрес", mess.getText());
        return new FormCheck(driver.get());
    }
}
