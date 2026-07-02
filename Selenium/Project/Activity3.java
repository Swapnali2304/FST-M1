package hrmactivity;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open OrangeHRM login page
        driver.get("https://hrm.alchemy.hguy.co/");
    }

    @Test
    public void loginManually() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("Browser is open.");
        System.out.println("Please enter Username and Password manually.");
        System.out.println("Click the LOGIN button.");
        System.out.println("Once the Home page opens, press ENTER here in the Console.");
        System.out.println("==============================================");

        // Wait until user presses Enter in the console
        sc.nextLine();

        // Verify page title
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "OrangeHRM");

        System.out.println("Login Successful!");
        System.out.println("Current Page Title: " + actualTitle);

        sc.close();
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        System.out.println("Browser Closed.");
    }
}