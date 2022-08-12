package firefoxtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class Geco_Driver {
    public static void main(String[] args) {
     Geco_Driver g = new Geco_Driver();
     g.m1();
    }
    public void m1(){
        String baseurl = " http://the-internet.herokuapp.com/login";//storing base url
        System.setProperty("webdriver.gecko.driver","webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//craete object for firefox driver
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
