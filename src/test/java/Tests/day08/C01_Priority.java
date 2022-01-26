package Tests.day08;

import org.testng.annotations.Test;

public class C01_Priority {


    @Test (priority = 9)
    public void youtubeTesti(){
        System.out.println("Youtube testi calisti");
    }


    @Test(priority = 0)
    public void amazonTesti(){ // pririty atanmazsa priority=0 kabul eder
        System.out.println("Amazon testi calisti");
    }


    @Test
    public void bestbuyTesti(){
        System.out.println("Bestbuy testi calisti");
    }

}