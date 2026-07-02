package hrmactivity;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    String firstName = "John";
    String lastName = "Smith";

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hrm.alchemy.hguy.co/");
    }

    @Test
    public void addEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Please login manually.");
        System.out.println("After Dashboard opens, press ENTER in the Eclipse Console.");
        System.out.println("====================================");

        sc.nextLine();

        // Click PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // Click Add Employee
        driver.findElement(By.id("menu_pim_addEmployee")).click();

        // Enter First Name
        driver.findElement(By.id("firstName")).sendKeys(firstName);

        // Enter Last Name
        driver.findElement(By.id("lastName")).sendKeys(lastName);

        // Click Save
        driver.findElement(By.id("btnSave")).click();

        // Go to Employee List
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        // Search employee by first name
        WebElement searchBox = driver.findElement(By.id("empsearch_employee_name_empName"));
        searchBox.clear();
        searchBox.sendKeys(firstName);

        // Click Search
        driver.findElement(By.id("searchBtn")).click();

        // Verify employee exists
        String pageSource = driver.getPageSource();

        Assert.assertTrue(pageSource.contains(firstName));

        System.out.println("Employee added successfully.");
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null) {
            driver.quit();
        }

        System.out.println("Browser Closed.");
    }
}