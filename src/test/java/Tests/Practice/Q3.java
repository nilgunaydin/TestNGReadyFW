package Tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Q3 {

//-->Task1 Find Dropdown on Multi Selection
//-->Task2 Find Dropdown Elements
//-->Task3 printout DropDown Elements number
//-->Task4 choose all dropdown elements and printout dropdown elements name
//-->Task5 check until choise 6

    WebDriver driver;
@BeforeClass
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
}

@Test
public void Task1(){
    WebElement dropMultiple = driver.findElement(By.id("justAnInputBox"));
    dropMultiple.click();
    List<WebElement> liste =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
    System.out.println(liste.size());

    for (int i = 0; i < liste.size(); i++) {
liste.get(i).click();
if (liste.get(i+1).getText().equals("choice 6")) {break;}
    }
}

}
