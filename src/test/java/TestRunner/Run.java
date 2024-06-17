package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
 
        //For JUnit @RunWith(Cucumber.class) used 
//@RunWith(Cucumber.class)      
@CucumberOptions(
		
		features = {".//Features/LoginFeature.feature",".//Features/Customers.feature"},
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		tags = "@Sanity", //Scenario under @Sanity tag will be executed
		//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
/*For Single Feature file execution*/
/*For All Feature file execution*/
		//{"pretty","junit:target/cucumber-reports/report_xml.xml"}
		//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		//plugin = {"pretty","json:target/cucumber-reports/report.json"}
		//LoginFeature.feature",".//Features/Customers.feature"
		
		//*For specific Feature file execution*/
//features = {".//Features/Customers.feature"},

//features = {".//Features/LoginFeature.feature",".//Features/Customers.feature"},
		

public class Run extends AbstractTestNGCucumberTests
{
	/*This class will be empty*/
}
