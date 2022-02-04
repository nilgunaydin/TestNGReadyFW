package Tests.ByMySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TekrarTesti2 extends TestBase {
    Select select;

    @Test
            public void test01(){

    //1-)Amazon dropdown menuden elektronik bolumu secin
        driver.get("https://www.amazon.com");
    WebElement ddElementi= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
   select =new Select(ddElementi);
//select.selectByIndex(10); //1.yontem ile
select.selectByVisibleText("Electronics");//2. yontem ile
//select.selectByValue("search-alias=electronics-intl-ship"); //3.yontem

    //2-)Arama Kutusuna iphone cable yazip Aratin ve bulunan sonuc sayisini yazdirin

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone cable", Keys.ENTER);
    //3-)Sonuc sayisi bildiren yazinin iphone icerdegini test edin
Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText().contains("iphone cable"));

//4-)Ikinci urune relative locater kullanarak tiklayin
        WebElement firstImg = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        driver.findElement(RelativeLocator.with(By.tagName("img")).below(firstImg)).click();

    //5-)Urunun title 'ini ve fiyatini variable'a assign edip urunu sepete Ekleyelim.
        System.out.println(driver.getTitle());
        String price=driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']")).getText();
       price=price.replace("$","");
        System.out.println("price = " + price);
       double Intprice = Double.parseDouble(price);
       Assert.assertTrue(Intprice<10);
        driver.findElement(By.id("add-to-cart-button")).click();
       driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();

}}
