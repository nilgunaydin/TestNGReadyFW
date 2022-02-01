package Tests.ByMySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class TekrarTesti extends TestBase {
    @Test
    public void test(){
        //amazona gidin
        //arama kutusunn solundaki dropdown menuyu handle edip lisetesini ekrana yazdirin
        //dropdown menüde 28 eleman oldugunu dogrulayın
        driver.get("https://www.amazon.com");
     WebElement dd =    driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    dd.click();
     Select select = new Select(dd);
    List<WebElement> ddlists = select.getOptions();
        for (WebElement w : ddlists ) {
            System.out.println(w.getText());
        }

        System.out.println(ddlists);
       Assert.assertEquals(ddlists.size(),28);
    }


}
