package casestudy.step_def;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import casestudy.utils.Driver;

import java.time.Duration;

public class Hooks {


    @Before
    public void setup(){
        Driver.get().get("https://www.bestbuy.com/");
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}