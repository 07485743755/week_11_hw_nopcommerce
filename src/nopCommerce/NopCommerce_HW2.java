package nopCommerce;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NopCommerce_HW2 {

    /*
    Homework – 2
    Navigate to website "https://demo.nopcommerce.com/"
    Click on register link.
    Fill the all fields.
    Click on register button.
    Verify that the user register successfully.
     */

    WebDriver driver;

    @Before

    public void navigateToNopCommerce(){

        String baseUrl="https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test

    public void verifyUserClickRegisterTabSuccessfully(){

    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
    driver.findElement(By.xpath("//span[@class='male']/input[@id='gender-male']")).click();
    driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Jems");
    driver.findElement(By.id("LastName")).sendKeys("Piter");
    driver.findElement(By.xpath(("//select[@name='DateOfBirthDay']//option[@value='4']"))).click();


    //List<WebElement>  dateList =driver.findElements(By.xpath(("//select[@name='DateOfBirthMonth']//option[@value='4']")));

    driver.findElement(By.xpath(("//select[@name='DateOfBirthMonth']//option[@value='4']"))).click();
    driver.findElement(By.xpath(("//select[@name='DateOfBirthYear']//option[@value='1998']"))).click();
    driver.findElement(By.id("Email")).sendKeys("jems14@gmail.com");
    driver.findElement(By.id("Company")).sendKeys("Google");
    driver.findElement(By.id("Newsletter")).click();
    driver.findElement(By.id("Password")).sendKeys("Jems12345");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Jems12345");
    driver.findElement(By.id("register-button")).click();

        String expectedMessage="Your registration completed";

        WebElement message=driver.findElement(By.xpath("//div[@class='result']"));

        String actualMessage=message.getText();

        System.out.println(actualMessage);

        Assert.assertEquals("Registration unsuccessful",expectedMessage,actualMessage);

    }

    @After

    public void tearDown(){

        driver.quit();
    }

}
