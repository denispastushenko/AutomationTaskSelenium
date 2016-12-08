package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormCheck extends Page {

    @FindBy(id="topLoginLink")
    private WebElement myProfile;

    @FindBy(id="userEmail")
    private WebElement userEmail;

    @FindBy(id="userPass")
    private WebElement userPass;

    @FindBy(id="checkbox_user-remember")
    private WebElement checkbox;

    @FindBy(xpath ="//div//button[@id='se_userLogin']" )
    private WebElement userLogin;

    @FindBy(xpath="//div//label")
    private WebElement mess;


    FormCheck(WebDriver webDriver) {
        super(webDriver);
    }

    public FormCheck checkFormValues(String value) throws InterruptedException {
        myProfile.click();
        Assert.assertEquals(userEmail.getText(),"");
        Assert.assertEquals(userPass.getText(),"");
        Assert.assertTrue(checkbox.isSelected());
        userEmail.sendKeys(value);
        userLogin.click();
        Assert.assertEquals(mess.getText(),"це не схоже на email-адресу");
        return  new FormCheck(driver.get());
    }
}
