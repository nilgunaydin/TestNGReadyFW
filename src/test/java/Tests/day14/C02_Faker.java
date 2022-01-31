package Tests.day14;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Faker extends TestBase {
    @Test
    public void facebookGirisTesti() throws Exception {

    //""  Adresine gidin
        driver.get("https://facebook.com");

    //“create new account”  butonuna basin

        driver.findElement((By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"))).click();
        //“firstName” giris kutusuna bir isim yazin
        //“surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin
        //“email” onay kutusuna emaili tekrar yazin
        //Bir sifre girin
        //Tarih icin gun secin
        //Tarih icin ay secin
        //Tarih icin yil secin
        //Cinsiyeti secin
      WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

      Actions actions = new Actions(driver);
      Faker faker = new Faker();
        String email=faker.internet().emailAddress();
      actions.click(firstName).sendKeys(faker.name().name()).sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
              .sendKeys(email).sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB).sendKeys(faker.internet().password()).
              sendKeys(Keys.TAB , Keys.TAB).sendKeys("12").sendKeys(Keys.TAB , Keys.TAB).sendKeys("1995").sendKeys(Keys.TAB, Keys.TAB).
              sendKeys(Keys.ARROW_DOWN,Keys.ARROW_LEFT).click().
              perform();

        Thread.sleep(10000);
        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        Assert.assertTrue(driver.findElement(By.xpath(("//input[@value='1']"))).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath(("//input[@value='2']"))).isSelected());

    //Sayfayi kapatin
}
}
