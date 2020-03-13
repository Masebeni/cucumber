package com.cucumber;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class CourseProperties {
    private Candidate course;
}
