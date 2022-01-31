package Tests.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

@Test
    public void test01(){

    //1- Amazon anasayfaya gidin
    driver.get("https://amazon.com");
    //2- tum cookie’leri listeleyin
    Set<Cookie> SetCookies = driver.manage().getCookies();
int counter=1;
    for ( Cookie cookie : SetCookies) {
        System.out.println(counter+". cookie ; "+cookie );
        counter++;

    }

    System.out.println("****************************************************************************");
    //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

    Assert.assertTrue(SetCookies.size()>5);

    //4- ismi  olan cookie degerinin USD oldugunu test edin

  Assert.assertTrue(driver.manage().getCookieNamed("i18n-prefs").getValue().equals("USD"))  ;
    //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
    Cookie mycookie = new Cookie("en sevdigim cookie","izmir bomba");
    driver.manage().addCookie(mycookie);

    //6- eklediginiz cookie’nin sayfaya eklendigini test edin
    Set<Cookie> newset = driver.manage().getCookies();
    int counters=1;
    for ( Cookie cookie : newset) {
        System.out.println(counters+". cookie ; "+cookie );
        counters++;}

Assert.assertTrue(newset.contains(mycookie));
        //7- ismi skin olan cookie’yi silin ve silindigini test edin

    driver.manage().deleteCookieNamed("skin");
    //8- tum cookie’leri silin ve silindigini test edin
    Set<Cookie> newset2 = driver.manage().getCookies();
Assert.assertFalse(newset2.contains(driver.manage().getCookieNamed("skin")));
    driver.manage().deleteAllCookies();
    Set<Cookie> newset3 = driver.manage().getCookies();
    Assert.assertTrue(newset3.size()==0);
}

}
