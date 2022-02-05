package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class odev10 extends TestBase {
    //bu soru sitenin psikolojisi bozuk oldugu icin iptal edilmistir
    @Test
    public void test() throws InterruptedException {
    // 1) "http://automationpractice.com/" ADRESiNE GiDiN
        driver.get("http://automationpractice.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    // 2) 2. URUNUN UZERiNE GELiP Add to chart YAPIN
      actions.moveToElement(driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"))).perform();
      actions.click(driver.findElement(By.xpath("(//a[@data-id-product='2'])[1]"))).perform();
      Thread.sleep(3000);

      actions.click(driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"))).perform();


    // 3) 4. URUNUN UZERiNE GELiP Add to chart YAPIN
        actions.moveToElement(driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[4]"))).perform();
        Thread.sleep(3000);
        actions.click(driver.findElement(By.xpath("(//a[@data-id-product='4'])[1]"))).perform();
        Thread.sleep(3000);
        actions.click(driver.findElement(By.xpath("//i[@class='icon-chevron-left left']"))).perform();

    // 4) 5. URUNUN UZERiNE GELiP Add to chart YAPIN
        actions.moveToElement(driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[5]"))).perform();
        Thread.sleep(3000);
        actions.click(driver.findElement(By.xpath("(//a[@data-id-product='5'])[1]"))).perform();
    // 5) CHART a gelin 3 ürün olduğunu doğrulayın
    // 6) CHART'A GELiP Chek out TIKLAYIN
    // 7) toplam alışveriş miktarının 108.97 olduğunu doğrula
        }
}
