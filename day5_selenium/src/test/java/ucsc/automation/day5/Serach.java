package ucsc.automation.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import javax.swing.*;

public class Serach {
WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void initBrowser(@Optional("chrome")String browser) {
        switch (browser){
            case"chrome":
            ChromeOptions chromeoptions = new ChromeOptions();
            chromeoptions.addArguments("--headless=new");
            driver=WebDriverManager.chromedriver().capabilities(chromeoptions).create();
            break;
            case"firefox":
            driver=WebDriverManager.firefoxdriver().create();
            break;
            case"edge":
            driver=WebDriverManager.edgedriver().create();

        }
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://odel.lk/home");
    }
    @Test
    public void WomenWear() throws InterruptedException {
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div/a[text()='WOMEN']"))).perform();
        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div/a[text()='WOMEN']/..//a[text()='Caps & Hats']"))).perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div/a[text()='WOMEN']/..//a[text()='Caps & Hats']")).click();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[text()='Brands']"))).click();
        Thread.sleep(4000);


}




@AfterTest
public void quitbrowser(){
        driver.quit();
}
}
