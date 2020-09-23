package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/Orange.feature",tags= {"@sanity"}, glue = {
 "Test_page" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class Orange_runners {

}
