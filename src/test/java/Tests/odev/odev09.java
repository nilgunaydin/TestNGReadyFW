package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBase;

public class odev09 extends TestBase {
@Test
    public void test() {
    //   1-  adresine gidelim
    driver.get("https://www.facebook.com");
    //    2- Yeni hesap olustur butonuna basalim
    driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();
    //    3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ayse", Keys.TAB+"fatma",
            Keys.TAB,"05052222222",Keys.TAB,"AyseFatma1234");
   driver.findElement(By.xpath("(//button[text()='Kaydol'])[1]")).click();

}
}