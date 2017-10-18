package pl.quayal.app.controller;


import org.springframework.web.bind.annotation.*;
import pl.quayal.app.model.Course;
import pl.quayal.app.model.Participant;
import pl.quayal.app.model.Trainer;
import pl.quayal.app.repository.ParticipantRepository;
import pl.quayal.app.service.CourseService;

import java.util.Set;

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
    public Course addTrainerToCourse(@PathVariable ("courseId") Long id, @RequestBody Trainer trainerToAdd) {
        return courseService.addTrainerToCourse(id, trainerToAdd);
    }

    @PostMapping("/{courseId}/participants")
    public Course addParticipantsToCourse (@PathVariable ("courseId") Long id, @RequestBody Set participantsToAdd) {
        return courseService.addParticipantsToCourse(id, participantsToAdd);
    }

    @DeleteMapping("/{courseId}/participants/{participantsId}")
    public Course removeParticipantFromCourse (@PathVariable ("courseId") Long courseId, @PathVariable ("participantsId") Long participantsId){
        return courseService.removeParticipantFromCourse(courseId, participantsId);
    }
}


