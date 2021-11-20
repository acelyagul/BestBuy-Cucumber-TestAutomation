package casestudy.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;
import casestudy.utils.Helper;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(css = "[alt='United States']")
    public WebElement country;
    public void chooseCountry(){
        country.click();
    }


    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;
    public void closePopup(){
        closeButton.click();
    }


    public void verifyHomePageTitle(String title) {
        Assert.assertEquals(title, Driver.get().getTitle());
    }


    @FindBy(id = "gh-search-input")
    public WebElement searchBox;
    @FindBy(css = "[aria-label='submit search']")
    public WebElement searchButton;
    public void searchFor(String searchKey) {
        searchBox.click();
        searchBox.sendKeys(searchKey);
        searchButton.click();
    }


    public void openDropdownMenu(String dropdownMenu) {
        Helper.openDropdownMenu(dropdownMenu);
    }


    @FindBy(linkText ="Sign In")
    public WebElement signInButton;
    public void signInButton() {
        signInButton.click();
    }


    @FindBy(css =".plButton-label.v-ellipsis")
    public WebElement LoggedUserInHiMessage;
    public void verifyLoggedInUser() {
        Assert.assertTrue(LoggedUserInHiMessage.getText().toLowerCase().contains("Hi,".toLowerCase()));
    }


    public void openNewTab() {
        Driver.get().switchTo().newWindow(WindowType.TAB);
    }


    public void navigateToHomePage() {
        Driver.get().get("https://www.bestbuy.com/");
    }


    @FindBy(className="hamburger-menu-button")
    public WebElement menuButton;
    public void chooseMenu(String targetMenu, String subMenu, String secSubMenu){
        menuButton.click();
        Helper.clickWithButtonText(subMenu);
        Helper.clickWithButtonText(secSubMenu);
        Helper.clickWithLinkText(targetMenu);
    }

}
