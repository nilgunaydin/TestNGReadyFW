package Tests.odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class elifOdev02 {

    /*
      ...Exercise2...
      http://www.bestbuy.com 'a gidin,
      Sayfa basliginin "Best" icerdigini(contains) dogrulayin
      Ayrica Relative Locator kullanarak;
          logoTest => BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
          mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
   */
     static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void testenOnce(){
        driver.get("http://www.bestbuy.com/");
    }
    @Test
    public void titleTest(){
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Best");
        Assert.assertTrue(iceriyorMu,"Title Best kelimesi icermiyor");
    }
    @Test
    public void logoTest(){
        WebElement helloHeading = driver.findElement(By.xpath("(//div[@class='heading'])[1]"));
        WebElement logo = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHeading));
        //   boolean logoGorunyorMu = logo.isDisplayed();
        //   Assert.assertTrue(logoGorunyorMu);
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    public void linkTest(){
        WebElement usLink = driver.findElement(By.xpath("(//img[@alt='United States'])[1]"));
        WebElement mexicoLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(usLink));
        Assert.assertTrue(mexicoLink.isDisplayed());
    }
    @AfterClass
    public static void kapat(){
        driver.quit();
    }

}
