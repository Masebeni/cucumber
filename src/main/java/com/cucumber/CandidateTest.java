package com.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/feature")
@EnableConfigurationProperties(CourseProperties.class)
public class CandidateTest {
}
