package Tests.day11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_TestBaseIlkTest extends TestBase {


    @Test
    public void test1() {
        driver.get("https://www.amazon.com");
    }
}
