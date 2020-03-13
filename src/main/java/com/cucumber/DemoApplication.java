package com.cucumber;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(CourseProperties.class)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CandidateTest.class);
		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
	}
}
