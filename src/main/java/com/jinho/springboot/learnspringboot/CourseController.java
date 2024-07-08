package com.jinho.springboot.learnspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        var a = new CurrencyServiceConfiguration();
        return Arrays.asList(
                new Course(1, "Learn Spring", "Jinho"),
                new Course(2, "Learn AWS", "Han"),
                new Course(3, "Learn DevOps", "Han"),
                new Course(4, "Learn Azure", "Han")
        );
    }
}

