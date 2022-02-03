package Tests.odev;

import org.testng.annotations.Test;
import utilities.TestBase;

public class odev07 extends TestBase {
    @Test (priority = 3)
    public void test01 () {
        driver.get("https://www.sahibinden.com/");
    }

    @Test (priority = 2)
    public void test02 () {
        driver.get("https://getir.com/");
    }

    @Test (priority = 1)
    public void test03 () {
        driver.get("https://www.gittigidiyor.com/");
    }


    @Test
    public void test04 () {
        driver.get("https://www.n11.com/");
    }





}
