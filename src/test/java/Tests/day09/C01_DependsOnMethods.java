package Tests.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DependsOnMethods {
    //● Bir class oluşturun: DependsOnTest
    //● https://www.amazon.com/ adresine gidin.
    //    1. Test : Amazon ana sayfaya gittiginizi test edin
    //    2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin ve aramanizin gerceklestigini Test edin
    //    3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin    $16.83 oldugunu test edin

WebDriver driver;
    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

   }

   @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.com/");
   }
   @Test (dependsOnMethods = "amazonTest")
    public void search(){
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    searchBox.sendKeys("Nutella", Keys.ENTER);
String ActualTitle = driver.getTitle();
String WantedWord = "Nutella";
Assert.assertTrue(ActualTitle.contains(WantedWord));

   }
   @Test (dependsOnMethods="search")
    public void fiyatTest(){
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        String fiyat = driver.findElement(By.xpath("//span[@class='a-size-base a-color-price']")).getText();
        Assert.assertEquals(fiyat,"$14.99");
   }

}
