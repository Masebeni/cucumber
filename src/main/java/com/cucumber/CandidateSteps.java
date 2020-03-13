package com.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

public class CandidateSteps {

	@Autowired
	private CourseProperties courseProperties;

	private Candidate candidate = new Candidate();

	@Given("^that the user (.*) is given a task to write (.*) certification exam$")
	public void certificationName(String name, String certication) throws Throwable {
		candidate.setCandidateName(name);
		candidate.setCertificateName(certication);
	}

	@When("^(.*) got (\\d+) marks in exam$")
	public void gotMarks(String name, int marks) throws Throwable {
		candidate.setCandidateName(name);
		candidate.setMarks(marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) throws Throwable {
		MatcherAssert.assertThat(name, CoreMatchers.is(candidate.getCandidateName()));
		MatcherAssert.assertThat(candidate.getCertificateName(), IsEqual.equalTo(certification));
		MatcherAssert.assertThat(candidate.getResult(), CoreMatchers.is(true));
	}

}
