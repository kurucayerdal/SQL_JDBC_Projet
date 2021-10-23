package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/feature/SQL_JDBC.feature"},
        glue = {"steps"},
        plugin = {"html:target/cucumber-report", // plugin pour Jenkins Cucumber Report
                "json:target/cucumber.json"}
)

public class SQL_JDBC_Runner extends AbstractTestNGCucumberTests {
}
