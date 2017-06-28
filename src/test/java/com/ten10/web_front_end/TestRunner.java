package com.ten10.web_front_end;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin = {"pretty"},
  features = {"src/test/resources/web_front_end"}
)

public class TestRunner {
}
