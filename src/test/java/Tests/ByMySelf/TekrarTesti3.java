package Tests.ByMySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TekrarTesti3 extends TestBase {
    @Test
    public void test(){
    //1. "" sayfasina gidin
    driver.get("http://webdriveruniversity.com/Actions");
    //2. "Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
        WebElement hoverOver = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        actions.moveToElement(hoverOver).perform();

    //3. "Link 1" e tiklayin
        WebElement link1 = driver.findElement(By.xpath("//a[text()='Link 1']"));
        actions.click(link1).perform();
    //4. Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
    //6. "Click and hold" kutusuna basili tutun

        actions.clickAndHold(driver.findElement(By.xpath("//p[text()='Click and Hold!']"))).perform();
    //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("(//div[@class='col-lg-12 text-center'])[3]")).getText());

        //8. "Double click me" butonunu cift tiklayin

        actions.doubleClick(driver.findElement(By.xpath("//h2[text()='Double Click Me!']"))).perform();
}}
