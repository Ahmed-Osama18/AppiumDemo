package pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.QueryingPage;

public class Accessibility_Page {
    WebDriver driver;
    By accessibility_node_provider_BTN = AppiumBy.accessibilityId("Accessibility Node Provider");
    By accessibility_node_querying_BTN = AppiumBy.accessibilityId("Accessibility Node Querying");

    public Accessibility_Page(WebDriver driver) {
        this.driver = driver;
    }
    public void validateAccessibilityNodeProviderIsShown()
    {
        Assert.assertEquals(driver.findElement(accessibility_node_provider_BTN).getText(),
                "Accessibility Node Provider");
    }
    public QueryingPage clickOnAccessibilityNodeQuerying()
    {
        driver.findElement(accessibility_node_querying_BTN).click();
        return new QueryingPage(driver);
    }
}
