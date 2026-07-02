package hrmactivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the OrangeHRM website
        driver.get("https://hrm.alchemy.hguy.co/");
    }

    @Test
    public void verifyWebsiteTitle() {

        // Expected website title
        String expectedTitle = "OrangeHRM";

        // Get actual website title
        String actualTitle = driver.getTitle();

        // Print the title
        System.out.println("Website Title: " + actualTitle);

        // Verify the title
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

        System.out.println("PASS: Website title verified successfully.");
    }

    @AfterMethod
    public void tearDown() {

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}