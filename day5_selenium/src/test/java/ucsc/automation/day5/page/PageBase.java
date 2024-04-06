package ucsc.automation.day5.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase{
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver=driver;
    }
    public PageEbayHome initApplication(){
        driver.get("https://www.ebay.com/");
        return PageFactory.initElements(driver,PageEbayHome.class);
    }
}
