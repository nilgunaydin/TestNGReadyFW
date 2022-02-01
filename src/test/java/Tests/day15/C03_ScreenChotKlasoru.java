package Tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenChotKlasoru extends TestBase {

    WebElement searchBox;

  @Test
  public void javatest() throws IOException {
        driver.get("https://amazon.com");
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("java", Keys.ENTER);
      WholePageSS();
  }

    @Test (priority = 1)
    public void nutellatest() throws IOException {
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.sendKeys("nutella", Keys.ENTER);
        WholePageSS();
    }
    @Test (priority = 2)
    public void elmatest() throws IOException {
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.sendKeys("elma", Keys.ENTER);
        WholePageSS();
    }



}
