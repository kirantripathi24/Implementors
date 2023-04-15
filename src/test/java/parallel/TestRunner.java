package parallel;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/Implementors.html" }, // reporting purpose
		monochrome = true, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/parallel" }, // location of feature files
		glue = { "parallel" }) // location of step definition and Hooks files

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
