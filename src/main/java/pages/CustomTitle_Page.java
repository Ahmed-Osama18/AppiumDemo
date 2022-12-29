package pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomTitle_Page {
    WebDriver driver;
    By textBox_locator = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    By tabName_locator = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]");
    By changeleft_BTN = AppiumBy.accessibilityId("Change Left");

    public CustomTitle_Page(WebDriver driver) {
        this.driver = driver;
    }

    public CustomTitle_Page InsertIntoTextBox(String text){
        driver.findElement(textBox_locator).clear();
        driver.findElement(textBox_locator).sendKeys(text);
        return this;
    }

    public CustomTitle_Page clickOnChangeLeft()
    {
        driver.findElement(changeleft_BTN).click();
        return this;
    }
    public void validateLeftTitle(String text)
    {
        Assert.assertEquals(driver.findElement(tabName_locator).getText(),text);
    }

}
