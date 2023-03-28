package Api.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(tags = "@patchApi",
        features = {"src/test/resources/Feature/Api/patchApi.feature"},
        glue = {"Api/StepDefinition"},
        monochrome = true,
        dryRun = false, // runs feature file so false to stop
        plugin = {
                "pretty", "html:build/reports/feature.html"
        })
@Test
public class PatchApiRunnerTests extends AbstractTestNGCucumberTests {

}