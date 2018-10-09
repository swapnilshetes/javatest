import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"D:/QATest/Cucumber_Selenium 2/Cucumber_Selenium/src/test/resources/features/iOS.feature:3"},
plugin = {"json:target/cucumber-parallel/2.json"},
monochrome = true,
tags = {},
glue = { "com.indecomm.scripts.el" })
public class Parallel02IT {
}
