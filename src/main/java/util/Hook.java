package util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    protected static WebDriver diver;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        diver = new ChromeDriver();
    }

    @After
    public void after(){
        diver.quit();
    }

    public static WebDriver getDiver(){
        return diver;
    }
}
