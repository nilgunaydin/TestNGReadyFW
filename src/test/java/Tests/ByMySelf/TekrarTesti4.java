package Tests.ByMySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TekrarTesti4 extends TestBase {

    @Test
    public void test(){
    //1. sayfasina gidin
    driver.get("http://webdriveruniversity.com/IFrame/index.html");
    //2.“Our Products” butonuna basin
        WebElement iFrame=driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iFrame);

        driver.findElement(By.xpath("//html/body/div[1]/div/div//div/ul/li[2]/a")).click();



    //3.“Cameras product”i tiklayin
        driver.findElement(By.xpath("//img[@id='camera-img']")).click();

        driver.switchTo().parentFrame();
    //Popup mesajini yazdirin
        driver.switchTo().frame(iFrame);

        String text = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
        System.out.println(text);


        //5.“close” butonuna basin

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        driver.switchTo().parentFrame();
    //6."WebdriverUniversity.com (IFrame)" linkini tiklayin
        driver.findElement(By.xpath("//a[text()='WebdriverUniversity.com (IFrame)']")).click();

    //7."" adresine gittigini test edin
Assert.assertTrue(driver.getCurrentUrl().equals("http://webdriveruniversity.com/index.html"));


    }
 }