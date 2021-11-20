package casestudy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports"
        },
        glue = "casestudy/step_def",
        features = "src/test/resources/features",
        tags = "@regression",
        dryRun = false
)
public class CucumberRunner {
}
