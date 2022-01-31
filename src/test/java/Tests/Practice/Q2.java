package Tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class Q2 {
    /*
birbirine bagimli testler olusturun..
.beforClass olusturup setUp ayarlarini yapin..
  birbirine bagimli testler olusturarak;
      ilk once facebook a gidin
      sonra facebook a bagimli olarak  a gidin,
      daha sonra google a bagimli olarak  a gidin
driver i kapatin

 */
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test (dependsOnMethods = "Test123")
    public void Tes(){
        driver.get("https://www.amazon.com");
        driver.close();
    }

    @Test (dependsOnMethods = "Testz")
    public void Test123(){
driver.get("https://www.google.com");
    }
    @Test
    public void Testz(){
        driver.get("https://www.facebook.com");
    }

}
