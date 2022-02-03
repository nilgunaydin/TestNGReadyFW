package Tests.odev;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class odev06 extends TestBase {
    @Test
    public void test(){

    // https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
    // Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String text = driver.findElement(By.tagName("h3")).getText();
        Assert.assertTrue(text.equals("Opening a new window"));
    // Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        Assert.assertTrue(driver.getTitle().equals("The Internet"));
    // Click Here butonuna basın.
        String Handle1 = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
    Set<String> handles = driver.getWindowHandles();
    String Handle2="";
        for (String handle : handles) {
if (handle!=Handle1) Handle2=handle;
        }
        driver.switchTo().window(Handle2);
        // Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

        Assert.assertTrue(driver.getTitle().equals("New Window"));
    // Sayfadaki textin “New Window” olduğunu doğrulayın.
        text = driver.findElement(By.tagName("h3")).getText();
        Assert.assertTrue(text.equals("New Window"));
    // Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
driver.switchTo().window(Handle1);
Assert.assertTrue(driver.getTitle().equals("The Internet"));


    }
}
