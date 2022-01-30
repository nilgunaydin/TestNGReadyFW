package Tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

import javax.xml.crypto.KeySelectorException;

public class time extends TestBase {

    @Test

    public void timeTest() throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        driver.get("https://www.bigtimer.net/?minutes=10&repeat=false");
        WebElement button = driver.findElement(By.xpath("//button[@class='button primary-primary with-label hideable start-pause']"));
       button.click();

      driver.wait();
    }
}
