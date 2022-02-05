package Tests.odev;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class elifHocaOdev04 extends TestBase {
@Test
        public void test() {
    //    go to url :
    driver.get("http://demo.automationtesting.in/Alerts.html");
    //    click  "Alert with OK" and click 'click the button to display an alert box:'
    driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

    //    accept Alert(I am an alert box!) and print alert on console
    Alert alert = driver.switchTo().alert();

    System.out.println(alert.getText());
    alert.accept();

    //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
    driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
    driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
    //    cancel Alert  (Press a Button !)
    alert.dismiss();
    //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
    driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
    driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

    //    and then sendKeys 'TechPro git Education' (Please enter your name)
    alert.sendKeys("TechPro git Education");
  alert.accept();
    //    finally print on console this message "Hello TechproEducation How are you today"
    System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());
//2.soru:Turkce
    // url'ye gidin :http://demo.automationtesting.in/Alerts.html
    // "Alert with OK"yi tıklayın ve 'click the button to display a confirm box' i tıklayın:'
    // Uyarıyı kabul et(I am an alert box!) ve uyarıyı konsolda yazdır
    //  "Alert with OK & Cancel" ı tıklayın ve 'click the button to display a confirm box' i tıklayın
    // Uyarıyı iptal et (Press a Button !)
    // "Alert with Textbox" ı tıklayın ve 'click the button to demonstrate the prompt box' tıklayın'
    // ve ardından sendKeys 'TechProEducation' (Lütfen adınızı girin)
    // sonunda "Hello TechproEducation How are you today" mesajını konsola yazdır (edited)
}}
