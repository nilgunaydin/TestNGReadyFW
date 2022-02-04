package Tests.odev;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class elifOdev05 extends TestBase {
@Test
public void testPhoneNumber() throws InterruptedException {
    //twitter a faker class kullanarak kayit olmaya calisiniz
    Faker faker = new Faker();
    driver.get("https://www.twitter.com");
    driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
WebElement isimKutusu = driver.findElement(By.xpath("//input[@name='name']"));
String phoneNumber = ("0534".concat(faker.phoneNumber().cellPhone().replaceAll("[).-]","7").substring(3,10)));
   while (phoneNumber.length() < 11)
   {phoneNumber= phoneNumber.concat("7");}
    while (phoneNumber.length() > 11)
    {phoneNumber= phoneNumber.substring(0,phoneNumber.length()-1);}

     isimKutusu.sendKeys(faker.name().name(), Keys.TAB, phoneNumber,
             Keys.TAB,Keys.TAB,"o",Keys.TAB,"12",Keys.TAB,"1995" );
Thread.sleep(1000);
 WebElement okButton = driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]"));

         // (By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")));
okButton.click();
    driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")).click();
driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")).click();
Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Telefonu onayla']")).isDisplayed());
    }
@Test
    public void testEmail() throws InterruptedException {
    Faker faker = new Faker();
    driver.get("https://www.twitter.com");
   driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();

    WebElement isimKutusu = driver.findElement(By.xpath("//input[@name='name']"));
    isimKutusu.sendKeys(faker.name().name(), Keys.TAB, Keys.TAB,Keys.ENTER );
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress(),Keys.TAB,Keys.TAB,"o",Keys.TAB,"12",Keys.TAB,"1995" );

    Thread.sleep(1000);
    WebElement okButton = driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]"));
okButton.click();
    driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")).click();
    driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")).click();
Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Sana bir kod gönderdik.']")).isDisplayed());


}

}
