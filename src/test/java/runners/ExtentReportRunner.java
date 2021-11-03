package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/feature/SQL_JDBC.feature"},
        glue = {"steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportSQL_Query.html"}
)

public class ExtentReportRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public void afterClass(){
        Reporter.loadXMLConfig("src/test/java/xmlFiles/ExtentReportSet.xml");
        Reporter.setSystemInfo("User Name", "Erdal Kurucay");
        Reporter.setSystemInfo("Application Name", "JDBC Database Testing");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("JDBC Database Testing Cucumber Report");
    }

}
