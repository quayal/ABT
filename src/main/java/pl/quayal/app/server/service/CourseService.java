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

    public Course addCourse(Course courseToAdd) {
        return courseRepository.save(courseToAdd);
    }



}
