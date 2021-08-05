

package testrunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"src/test/resources/functionalTests/admin.feature"},
		 glue= {"Stepdefinition"},
		 tags={"@loginvalid1"},
		 monochrome = false
 )
public class Runner {
}