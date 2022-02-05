package Tests.ByMySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1  extends TestBase {
    Select select;

@BeforeClass
public void test1() {
    // * Navigate to  https://www.saucedemo.com/
    driver.navigate().to("https://www.saucedemo.com");
    // * Enter the user name  as
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

    // * Enter the password as
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

    // * Click on login button
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
}

@Test
    public void task1() {
    // *     T1 : Choose price low to high
     select= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
select.selectByIndex(2);
}

    @Test (priority = 1)
    public void task2() {
        // *     T2 : Verify item prices are sorted from low to high with soft Assert
List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

List<Double> listOfPrices = new ArrayList();

        for (WebElement price : list) {
        Double sayi = Double.parseDouble(price.getText().replace("$",""));
        listOfPrices.add(sayi);
        }
                 List<Double> sortedPrices = listOfPrices;
        Collections.sort(sortedPrices);
Assert.assertEquals(sortedPrices,listOfPrices);

}
    }



