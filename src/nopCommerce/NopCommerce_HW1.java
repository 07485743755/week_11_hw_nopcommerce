package nopCommerce;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce_HW1 {

        /*
    Homework -1
    Navigate to google https://www.google.com/
    In Google search type "nopCommerce demo store" and click search
    Click on the link "nopCommerce demo store"
    Click on Computers and Verify that the user successfully navigated to Computers page.
    Navigate to google https://www.google.com/
    In Google search type "nopCommerce demo store" and click search
    Click on the link "nopCommerce demo store"
    Click on Electronics and Verify that the user successfully navigated to Electronics page.
    Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

     */

    WebDriver driver;

    @Before

    public void navigateToGoogleAndNavigateToNopCommerce() {

        String chromeUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(chromeUrl);

        //Navigate to nopCommerce
        driver.findElement(By.xpath("//div[text()='I agree']")).click();

        driver.findElement(By.cssSelector(".gLFyf")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();

        driver.findElement(By.xpath("//cite[@class='iUh30 Zu0yb tjvcx']")).click();
    }

    @Test

    public void verifyUserNavigateToComputersPageSuccessfully() {

        driver.findElement(By.xpath("//a[text()='Computers '][1]")).click();

        String expectedMessage = "Computers";

        WebElement message = driver.findElement(By.xpath("//h1[text()='Computers']"));

        String actualMessage = message.getText();

        Assert.assertEquals("User does not navigate to Computers page", expectedMessage, actualMessage);
    }

    @Test

    public void verifyUserNavigateToElectronicsPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Electronics '][1]")).click();
        String expectedMessage = "Electronics";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Electronics']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Electronics page",expectedMessage,actualMessage);

    }

    @Test

    public void verifyUserNavigateToApparelPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Apparel '][1]")).click();

        String expectedMessage = "Apparel";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Apparel']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Apparel page",expectedMessage,actualMessage);



    }

    @Test

    public void verifyUserNavigateToDigitalDownloadsPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Digital downloads '][1]")).click();

        String expectedMessage = "Digital downloads";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Digital downloads']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Digital downloads page",expectedMessage,actualMessage);


    }

    @Test

    public void verifyUserNavigateToBooksPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Books '][1]")).click();

        String expectedMessage = "Books";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Books']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Books page",expectedMessage,actualMessage);


    }

    @Test

    public void verifyUserNavigateToJewelryPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Jewelry '][1]")).click();

        String expectedMessage = "Jewelry";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Jewelry']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Jewelry page",expectedMessage,actualMessage);


    }

    @Test

    public void verifyUserNavigateToGiftCardsPageSuccessfully(){

        driver.findElement(By.xpath("//a[text()='Gift Cards '][1]")).click();

        String expectedMessage = "Gift Cards";

        WebElement message=driver.findElement(By.xpath("//h1[text()='Gift Cards']"));

        String actualMessage=message.getText();

        Assert.assertEquals("User does not navigate to Gift Cards page",expectedMessage,actualMessage);


    }

    @After

    public void tearDown() {

         driver.quit();
    }


}
