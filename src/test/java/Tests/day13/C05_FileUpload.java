package Tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_FileUpload extends TestBase {
    @Test
    public void test01 () throws InterruptedException {
        //Tests packagenin altina bir class oluşturun : C05_UploadFile
        // adresine gidelim
        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.
        //Upload butonuna basalim.
        //“File Uploaded!” textinin goruntulendigini test edelim

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileSecButtonu = driver.findElement(By.id("file-upload"));

        String Dosyayolu = System.getProperty("user.home")+"\\OneDrive\\Desktop\\deneme\\selenium.xlsx";

        fileSecButtonu.sendKeys(Dosyayolu);

        WebElement UploadButton = driver.findElement(By.id("file-submit"));

        UploadButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed());
        Thread.sleep(2000);
//elhamdurilllah
    }
}
