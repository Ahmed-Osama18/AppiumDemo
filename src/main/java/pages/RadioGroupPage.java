package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioGroupPage {
    WebDriver driver;
    By allOfThem_BTN = AppiumBy.accessibilityId("All of them");
    By allOfThem_checkBox = AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"All of them\"]");


    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAllOfThem()
    {
        driver.findElement(allOfThem_BTN).click();
        Assert.assertEquals(driver.findElement(allOfThem_checkBox).getAttribute("checked"),"true");
    }
}
