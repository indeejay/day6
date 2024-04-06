package ucsc.automation.day5.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGUtils {
    public static WebDriver driver;
    @BeforeTest
    public void initBrowser(){
        driver = WebDriverManager.chromedriver().create();
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
