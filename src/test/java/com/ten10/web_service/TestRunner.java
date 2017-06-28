package com.ten10.web_service;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   plugin = {"pretty"},
   features = {"src/test/resources/web_service"}
)

public class TestRunner {
}
