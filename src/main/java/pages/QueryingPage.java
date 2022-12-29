package pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class QueryingPage {
    WebDriver driver;
    By checkbox_locator = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");

    public QueryingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnDoTaxes(){
        driver.findElement(checkbox_locator).click();
        Assert.assertEquals(driver.findElement(checkbox_locator).getAttribute("checked"),"true");
    }
}
