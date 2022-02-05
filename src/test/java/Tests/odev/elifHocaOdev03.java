package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class elifHocaOdev03 extends TestBase {

    //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //maximize the window
//click on action dialog button
    //if need use explicitly wait
//click on the ok button
//accept the iframe message
@Test
    public void test() throws InterruptedException {
    driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");
    driver.manage().window().maximize();
    driver.findElement(By.id("action")).click();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialog-mycodemyway-action"))).click();
 //   wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();

}}
