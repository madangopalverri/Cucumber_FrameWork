package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
( 
		//given the feture package file path(Registration.fearure)
		features= "C:\\Users\\hi\\eclipse-workspace\\Parabank\\src\\test\\java\\futureFile\\Login.feature",
		//given the steDefination package name
		glue="stepDefination",
		tags = "@Sanity",
		plugin= {"pretty",
				"html:Reports/newreport2.html",
				"json:Reports/newreport2.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)
public class TestRunner {

}
