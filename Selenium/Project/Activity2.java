package hrmactivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hrm.alchemy.hguy.co/");
    }

    @Test
    public void getHeaderImageURL() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement image = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("img")));

        String imageURL = image.getAttribute("src");

        System.out.println("Header Image URL: " + imageURL);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}