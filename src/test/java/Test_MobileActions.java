import Actions.MobileActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test_MobileActions {
    WebDriver driver;
    Page_MobileActions pageMobileActions;
    Home_Page homePage;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
//        pageMobileActions = new Page_MobileActions(driver);
//        pageMobileActions.setCapabilities();
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Mi 9T");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        homePage = new Home_Page(driver);
        new MobileActions(driver);
    }

    @Test
    public void testClickAction() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickOnAccessibility()
                .validateAccessibilityNodeProviderIsShown();
    }

    @Test(dependsOnMethods = "testClickAction")
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String keys = "appium";
        homePage.clickOnApp()
                .clickOnActivity()
                .clickOnCustomTitle()
                .InsertIntoTextBox(keys)
                .clickOnChangeLeft()
                .validateLeftTitle(keys);
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked

        homePage.clickOnAccessibility()
                .clickOnAccessibilityNodeQuerying()
                .clickOnDoTaxes();
    }


    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickOnGraphics()
                .clickOnScaleToFit();
    }



    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickOnGraphics().
                clickOnVertices()
                .swipeRight()
                .swipeLeft();
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickOnViews()
                .clickOnRadioGroup()
                .clickOnAllOfThem();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
