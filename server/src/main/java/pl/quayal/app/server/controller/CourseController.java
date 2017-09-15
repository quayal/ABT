package pl.quayal.app.server.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.quayal.app.server.model.Course;
import pl.quayal.app.server.service.CourseService;

@RestController
@RequestMapping("/course")

public class CourseController {


    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course courseToAdd) {

        return courseService.addCourse(courseToAdd);

    }

}


