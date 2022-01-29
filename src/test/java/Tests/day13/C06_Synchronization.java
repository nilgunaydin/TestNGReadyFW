package Tests.day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_Synchronization extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        /*
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-submit")).click();
    */
        /*
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("//yt-formatted-string[text()='I Agree']")).click();
*/
        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("(//a[text()='info@techproeducation.com'])[2]")).click();
        Thread.sleep(5000);}
    @Test
    public void test02 () throws InterruptedException {
    //    driver.get("https://the-internet.herokuapp.com/upload");
    //    driver.findElement(By.id("file-submit")).click();

    driver.get("https://www.youtube.com");
    Thread.sleep(5000);
    }
}
