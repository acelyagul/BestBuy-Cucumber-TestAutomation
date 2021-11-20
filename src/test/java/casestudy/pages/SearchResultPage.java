package casestudy.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;
import casestudy.utils.Helper;

public class SearchResultPage {

    public SearchResultPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = ".search-title")
    public WebElement resultTitle;
    public void verifySearchResult(String searchKey) {
        Assert.assertTrue(resultTitle.getText().contains(searchKey));
    }


    @FindBy(id="brand_facet-search-bar-input")
    public WebElement brandBox;
    public void selectBrand(String brand) {
        brandBox.click();
        brandBox.sendKeys(brand);
        brandBox.sendKeys(Keys.ARROW_DOWN);
        brandBox.sendKeys(Keys.ENTER);
        Helper.waitFor(5);
    }


    public void chooseProduct(Integer productNumber) {
        Helper.selectProductFromList(productNumber);
    }

}
