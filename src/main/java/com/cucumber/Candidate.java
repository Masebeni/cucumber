package com.cucumber;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Candidate {

	private Long id;
	private String CandidateName;
	private String course;
	private String certificateName;
	private String examNumber;
	private int marks;
	private boolean results;

	public boolean getResult() {
		return results = marks <= 60 ? true : false;
	}

}
