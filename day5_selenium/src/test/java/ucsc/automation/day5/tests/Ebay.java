package ucsc.automation.day5.tests;

import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ucsc.automation.day5.page.PageBase;
import ucsc.automation.day5.page.PageEbayHome;
import ucsc.automation.day5.utils.TestNGUtils;

public class Ebay extends TestNGUtils {

    @Test
    public void mobileSearch(){
        PageBase pageBase = PageFactory.initElements(driver, PageBase.class);
        pageBase.initApplication();

//        PageEbayHome pageEbayHome=pageBase.initApplication();


    }
}
