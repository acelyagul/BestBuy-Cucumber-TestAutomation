package casestudy.pages;

import casestudy.utils.ConfigFileReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;
import casestudy.utils.Helper;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy( id = "fld-e" )
    public WebElement eMail;
    @FindBy( id = "fld-p1" )
    public WebElement password;
    public void FillTheLoginForm() {
        eMail.click();
        eMail.sendKeys(ConfigFileReader.get("username"));
        password.click();
        password.sendKeys(ConfigFileReader.get("password"));
    }


    @FindBy( css = "[type='submit']" )
    public WebElement submit;
    public void submitLoginForm() {
        submit.sendKeys(Keys.ENTER);
    }


    @FindBy( xpath="//button[text()='Sign in with Google']" )
    public WebElement withGoogle;
    public void clickGoogleSignInButton() {
        withGoogle.click();
    }


    @FindBy( id="identifierId" )
    public WebElement googleEmail;
    @FindBy( id="identifierNext" )
    public WebElement emailPageNextButton;
    @FindBy( name="password" )
    public WebElement googlePassword;
    @FindBy( id="passwordNext" )
    public WebElement passwordPageNextButton;

    public void fillGoogleAccountForm() {
        Helper.switchLastTab();
        googleEmail.click();
        googleEmail.sendKeys(ConfigFileReader.get("gmail_username"));
        emailPageNextButton.click();
        googlePassword.click();
        googlePassword.sendKeys(ConfigFileReader.get("gmail_password"));
        passwordPageNextButton.click();
        Helper.waitFor(2);
        Helper.switchLastTab();
    }


}
