package casestudy.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import casestudy.pages.Homepage;
import casestudy.pages.ProductDetailPage;
import casestudy.pages.SearchResultPage;
import casestudy.pages.SignInPage;
import casestudy.utils.Driver;
import casestudy.utils.Helper;

public class MyStepdefs {
    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SignInPage signInPage = new SignInPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Given("Homepage is open")
    public void homepageIsOpen() { homepage.chooseCountry(); }

    @And("Window should be maximize")
    public void windowShouldBeMaximize() {
        Driver.maximizeDriver();
    }

    @And("Close the pop up")
    public void CloseThePopUp() {
        homepage.closePopup();
    }

    @And("Homepage should open")
    public void homepageShouldOpen() {
        homepage.verifyHomePageTitle("Best Buy | Official Online Store | Shop Now & Save"); }

    @When("Search for {string} keyword")
    public void SearchForKeyword(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @Then("Search result should show {string}")
    public void searchResultShouldBeSeen(String searchKey) {
        searchResultPage.verifySearchResult(searchKey);
    }

    @And("Navigate to Sign in page under the {string} menu")
    public void navigateToSignInPageUnderTheMenu(String Menu) {
        homepage.openDropdownMenu(Menu);
        homepage.signInButton();
    }

    @When("Fill the login form with user informations")
    public void FillTheLoginFormWithUserInformations() throws Exception {
        signInPage.FillTheLoginForm();
    }

    @And("Submit login form")
    public void submitLoginForm() {
        signInPage.submitLoginForm();
    }


    @And("Sign in with google")
    public void SignInWithGoogle() throws Exception {
        Helper.waitFor(2);
        signInPage.clickGoogleSignInButton();
        signInPage.fillGoogleAccountForm();
    }

    @And("Verify login is successful")
    public void verifyLoginIsSuccessful() { homepage.verifyLoggedInUser(); }

    @When("Open a new browser tab")
    public void openANewBrowserTab() {
        homepage.openNewTab();
    }

    @And("Navigate to homepage")
    public void navigateToHomepage() {
        homepage.navigateToHomePage();
    }

    @Then("User should be login in new tab")
    public void userShouldBeLoginInNewTab() {
        homepage.verifyLoggedInUser();
    }

    @And( "Click on the {string} button at Menu,{string}, {string}" )
    public void clickOnTheButtonAtMenu(String targetMenu, String subMenu, String secSubMenu) {
        homepage.chooseMenu(targetMenu,subMenu,secSubMenu);
    }

    @And( "Select {string} brand" )
    public void selectBrand(String brand) { searchResultPage.selectBrand(brand); }

    @And( "Navigate to {int}rd product" )
    public void navigateToProduct(Integer productNumber) {
        searchResultPage.chooseProduct(productNumber);
    }

    @When( "Click save button" )
    public void clickSaveButton() {
        productDetailPage.saveProduct();
    }

    @And( "Navigate to {string} menu" )
    public void navigateToMenu(String Menu) {
        homepage.openDropdownMenu(Menu);
    }

    @Then( "Verify items have saved product" )
    public void verifyItemsHaveSavedProduct() {
        productDetailPage.verifySavedProduct();
    }

}
