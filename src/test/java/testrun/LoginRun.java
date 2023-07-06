package testrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/Login.feature",
glue="stepdef",
dryRun=false,
monochrome=true,
//plugin= {"pretty","html:target/reports/report1.html"}
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class LoginRun extends AbstractTestNGCucumberTests {

}




