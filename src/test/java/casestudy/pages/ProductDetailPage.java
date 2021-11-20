package casestudy.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;

public class ProductDetailPage {

    public ProductDetailPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className= "save-for-later-save")
    public WebElement saveButton;
    public void saveProduct(){
        saveButton.click();
    }


    @FindBy(className = "sku-card-product-title")
    public WebElement savedProductTitle;
    @FindBy(className = "sku-title")
    public WebElement productTitle;
    public void verifySavedProduct() {
        Assert.assertEquals(savedProductTitle.getText(),productTitle.getText());
    }
}
