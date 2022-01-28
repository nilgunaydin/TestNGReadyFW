package Tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_WindowHandle {
    WebDriver driver;


@BeforeClass
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}

@Test
    public void handle() {
        driver.get("https://www.amazon.com");
   String AmazonHandle = driver.getWindowHandle();
    System.out.println("Handle degeri "+ AmazonHandle);
    driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.bestbuy.com");
String bestBuyHandle = driver.getWindowHandle();
    System.out.println("windowhandel degerleri "+ driver.getWindowHandles());
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.facebook.com");
    driver.switchTo().window(AmazonHandle);
    WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    aramaKutusu.sendKeys("nutella", Keys.ENTER);
driver.switchTo().window(bestBuyHandle);
Assert.assertTrue(driver.getTitle().contains("Best Buy"));

}

@AfterClass
    public void tearDown() {
    driver.quit();

}


}
