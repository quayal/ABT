package pl.quayal.app.controller;


import org.springframework.web.bind.annotation.*;
import pl.quayal.app.model.Course;
import pl.quayal.app.model.Trainer;
import pl.quayal.app.service.CourseService;

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

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable ("courseId") Long id) {
        return courseService.getCourse(id);
    }

    @PostMapping("/{courseId}/trainers")
    public Course addTrainerToCourse(@PathVariable ("courseId") Long id, @RequestBody Trainer trainerToAdd){
        return courseService.updateCourse(id, trainerToAdd);
    }
}


