package com.org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "./featurefiles"},
		glue = "com.org.gluecode",
		tags="@tag1")
public class LoginRunnerFile {

}
