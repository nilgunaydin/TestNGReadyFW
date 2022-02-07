package Tests.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class odev08 extends TestBase {
    // 1) "" SAYFASINA GiDiN
   @Test
    public void test(){
       driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();
    // 2) YENi HESAP OLUSTUR BUTONUNA TIKLAYIN
    // 3) DOGUM TARiHi BOLUMUNDEKi GUNLERiN LiSTESiNi ALIN
       Select select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
       List<WebElement> listOfWEdays = select.getOptions();
     List<String> listOfdays = new ArrayList<String>();
       for (WebElement w:listOfWEdays) {
           listOfdays.add(w.getText());
       }
       System.out.println(listOfdays);
    // 4) DOGUM TARiHi BOLUMUNDEKi AYLARIN LiSTESiNi ALIN
       Select select2 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
       List<WebElement> listOfWEmonths = select2.getOptions();
       List<String> listOfmonths = new ArrayList<String>();
       for (WebElement w:listOfWEmonths) {
           listOfmonths.add(w.getText());
       }
       System.out.println(listOfmonths);
    // 5) DOGUM TARiHi BOLUMUNDEKi YILLARIN LiSTESiNi ALIN
       Select select3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
       List<WebElement> listOfWEyears = select3.getOptions();
       List<String> listOfyears = new ArrayList<String>();
       for (WebElement w:listOfWEyears) {
           listOfyears.add(w.getText());
       }

       System.out.println(listOfyears);

}
}