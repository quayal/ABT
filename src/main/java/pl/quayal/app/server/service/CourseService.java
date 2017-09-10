package pl.quayal.app.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.quayal.app.server.model.Course;
import pl.quayal.app.server.model.Trainer;
import pl.quayal.app.server.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(String courseName, Trainer courseMainTrainer, Trainer courseSecondTrainer) {

        Course course = new Course(courseName, courseMainTrainer, courseSecondTrainer);

        return courseRepository.save(course);

    }



}
