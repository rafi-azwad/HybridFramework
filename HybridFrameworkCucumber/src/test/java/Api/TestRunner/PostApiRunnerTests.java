package Api.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(tags = "@postApi",
        features = {"src/test/resources/Feature/Api/postApi.feature"},
        glue = {"Api/StepDefinition"},
        monochrome = true,
        dryRun = false, // runs feature file so false to stop
        plugin = {
                "pretty", "html:build/reports/feature.html"
        })
@Test
public class PostApiRunnerTests extends AbstractTestNGCucumberTests {

}