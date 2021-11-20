package casestudy.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Helper {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void switchLastTab() {
        String originTab = Driver.get().getWindowHandle();
        Set<String> allTabs = Driver.get().getWindowHandles();

        for(String tab : allTabs){
            if(!originTab.equals(tab))
                Driver.get().switchTo().window(tab);
        }
    }


    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }


    public static void clickWithButtonText(String linkText){
        Driver.get().findElement(By.xpath("//button[contains(text(),'"+linkText+"')]")).click();
    }


    public static void openDropdownMenu(String dropdownMenu) {
        String locator = "//span[text()='" + dropdownMenu + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }


    public static void selectProductFromList(Integer productNumber){
        List<WebElement> resultProductsList = Driver.get().findElements(By.cssSelector("h4.sku-header"));
        WebElement productName = resultProductsList.get(productNumber-1);
        clickWithLinkText(productName.getText());
    }
}
