package Tests.day13;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {

    @Test
    public void isExisttest (){
        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\logo.jpeg";
      Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    //4. Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim

}
    @Test
    public void downloadTest() throws InterruptedException {
driver.get("https://the-internet.herokuapp.com/download");
driver.findElement(By.xpath("//a[text()='logo.jpeg']")).click();
Thread.sleep(2500);

    }
}
