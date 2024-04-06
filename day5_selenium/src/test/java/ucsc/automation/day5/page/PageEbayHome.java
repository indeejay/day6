package ucsc.automation.day5.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageEbayHome {
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement SearchField;
    @FindBy(xpath = "//select[@id='gh-cat']")
    public WebElement CategorySelector;
    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButton;

    public void typeOnSearchField(String TypingValue){
        SearchField.sendKeys();
       }
    public void selectcategory(String category){
    new Select(CategorySelector).selectByVisibleText(category);
    }

    public void ClickOnSearchButton(){
        searchButton.click();
    }
}
