package Tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_JsExecutorScrollInToView extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.hotelmycamp.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[2]")).click();



    }




}
