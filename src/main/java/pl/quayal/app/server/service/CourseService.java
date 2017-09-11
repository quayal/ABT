package pl.quayal.app.server.service;


import org.springframework.stereotype.Service;
import pl.quayal.app.server.model.Course;
import pl.quayal.app.server.repository.CourseRepository;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course courseToAdd) {
        return courseRepository.save(courseToAdd);
    }



}
