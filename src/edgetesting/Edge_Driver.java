package edgetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Driver {
    public static void main(String[] args) {
      Edge_Driver e = new Edge_Driver();
      e.m1();
    }
    public void m1(){
        String baseurl = "http://the-internet.herokuapp.com/login";//storing base url
        System.setProperty("webdriver.edge.driver","webdrivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//create object for edge driver
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title =driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
