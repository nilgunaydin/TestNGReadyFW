package Tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BasicAuthentication {
    WebDriver driver;
    //1- Bir class olusturun : BasicAuthentication
    //2-  sayfasina gidin

@BeforeClass
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //driver.get("https://the-internet.herokuapp.com/basic_auth");
}

@Test
    public void test(){
    //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    //    Html komutu : https://username:password@URL
    //    Username     : admin
    //    password      : admin
    //4- Basarili sekilde sayfaya girildigini dogrulayin

    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
Assert.assertTrue(driver.findElement(By.xpath("//p")).isDisplayed());
}

@AfterClass
    public void tearDown(){

    driver.close();
}



}
