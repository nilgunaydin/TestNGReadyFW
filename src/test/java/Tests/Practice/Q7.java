package Tests.Practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class Q7 extends TestBase {
@Test
    public void test(){
    // 1. "" adresine gidin
    driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
    // 2. CLICK ME of JavaScript Alert e tıklayın
    driver.findElement(By.id("button1")).click();
    System.out.println(driver.switchTo().alert().getText());
    // 3. pop up text i alın
    // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
    SoftAssert softAssert= new SoftAssert();
    softAssert.assertTrue(driver.switchTo().alert().getText().equals("I am an alert box!"));
    // 5. pop up i kabul edin
    driver.switchTo().alert().accept();
}

@Test (dependsOnMethods = "test")
    public void test2(){

    // 1. "" adresine gidin
    driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
    // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
    driver.findElement(By.id("button4")).click();
    // 3.  pop up text i alın
   String popUpMessage = driver.switchTo().alert().getText();
    // 4. Mesajın "" olduğunu doğrulayın
    SoftAssert softAssert= new SoftAssert();
    softAssert.assertTrue(popUpMessage.equals("Press a button!"));
/*
Alert alert = driver.switchTo().alert();  //bu sekilde de kullanimi mevcuttur
driver.switchTo().alert();     yerine    Alert data turundeki alert variable ini kullandik.
alert variable ile methodlara ulasilabilir
    alert.dismiss();
    alert.accept();  vb
    bu kullanim sayesinde switchto() yazmamiza gerek kalmaz
 */
    // 5. Açılır pencereyi kapat
    driver.switchTo().alert().dismiss();
    // 6. pop up i iptal edin,
    // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
softAssert.assertTrue(driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).isDisplayed());
    // 8. alert1'e göre dependsOnMethods kullanın

}

}
