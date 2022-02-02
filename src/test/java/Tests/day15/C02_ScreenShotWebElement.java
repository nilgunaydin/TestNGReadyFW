package Tests.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_ScreenShotWebElement extends TestBase {
    @Test
    public void nutellaTesti() throws IOException {

        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella", Keys.ENTER);
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        Assert.assertTrue(sonucYazisiElementi.getText().contains("nutella"));
    //lets take ss of a  webelement

    //burada resmi cekilecek webelementi locate etmek de vardi ama we allready have one

        File resultTextWebElement = new File("target/screenShot/resultText.jpeg");

        File geciciResim = sonucYazisiElementi.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciciResim,resultTextWebElement);


    }

}
