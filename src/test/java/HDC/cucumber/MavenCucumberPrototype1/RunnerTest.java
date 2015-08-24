package HDC.cucumber.MavenCucumberPrototype1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		format = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
		features = "src/test/resource",
		//tags = {"@completed"}
		//tags = {"@test"}
		//tags = {"@forrentsrp"}
		//tags = {"@schoolsfs"}
		//tags = {"@mortagefirst"}
		tags = {"@mortgage"}
		)

public class RunnerTest {

}
