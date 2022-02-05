package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class Odev11 extends TestBase {
@Test
    public void test() {
    //      go to url :
    driver.get("http://demo.guru99.com/popup.php");
    //      get the first window
    String window1 = driver.getWindowHandle();
    driver.switchTo().window(window1);
    //      clicking on click here button
    driver.findElement(By.xpath("//a[text()='Click Here']")).click();

    //      get all the window in the set
    Set<String> windows=driver.getWindowHandles();
    //      switch to window
    String window2="";
    for (String window : windows) {
    if (!window.equals(window1)) {
        window2 = window;
    }}
    driver.switchTo().window(window2);

    //      input email id (somepne@gmail.com) and type something in that input
    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("somepne@gmail.com");
    //      Clicking on the submit button
    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    //      verify title as expected

    String expectedTitle = "Guru99 Bank Home Page";
    Assert.assertEquals(expectedTitle, driver.getTitle());
    //      switch to first window
driver.switchTo().window(window1);


}
}
