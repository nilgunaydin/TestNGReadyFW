package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class odev12 extends TestBase {
    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
    @Test
            public void Test(){
    driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
// 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
// (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
List<WebElement> listOfProducts = driver.findElements(By.xpath("//p[@class='shelf-item__title'] "));
        System.out.println("sitede "+listOfProducts.size()+" urun var: ");
        int counter=1;
        for (WebElement product : listOfProducts) {
            System.out.println(counter+".urun: "+product.getText());
        counter++;
        }

        System.out.println("\n**********************************************************\n");
// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String>NamesOfProducts = new ArrayList();
        for (WebElement product : listOfProducts){
            NamesOfProducts.add(product.getText());
        }
// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)
        Random rand = new Random();
        List<WebElement> addCarts = driver.findElements(By.xpath("//div[@class='shelf-item__buy-btn']"));
        for (int i = 1; i <=5 ; i++) {
            WebElement that =  addCarts.get(rand.nextInt(addCarts.size()));
            that.click();
            addCarts.remove(that); }
        List<WebElement> productsInCart = driver.findElements(By.xpath("//p[@class='title']"));

       for (WebElement name : productsInCart) System.out.println(name.getText()+" sepete eklendi !");


// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın

        List<WebElement> PricesElements = driver.findElements(By.xpath("//div[@class='shelf-item__price']"));
        for (int i = 1; i <=16 ; i++) {
            PricesElements.remove(0);
        }
        List<Double> Prices = new ArrayList<Double>();
        for (WebElement w:PricesElements) {
            Prices.add(Double.parseDouble(w.getText().replaceAll("[$'\"+-]","")));
        }
        double totalPrice = 0.00;
        for (Double i:Prices) {
            totalPrice +=i;
        }
        String TotalInSite = driver.findElement(By.xpath("//p[@class='sub-price__val']")).getText();
Double totalPriceInSite = Double.parseDouble(TotalInSite.replaceAll("[$'\"+-]",""));
Assert.assertEquals(totalPrice, totalPriceInSite);


// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
System.out.println("Test PASS");
// 7.Checkout'a tıklayın
        driver.findElement(By.xpath("//div[@class='buy-btn']")).click();
}}
