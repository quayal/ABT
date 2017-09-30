package pl.quayal.app.service;


import org.springframework.stereotype.Service;
import pl.quayal.app.model.Course;
import pl.quayal.app.repository.CourseRepository;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course courseToAdd) {
        return courseRepository.save(courseToAdd);
    }

    public Course getCourse(Long courseId) {
        return courseRepository.findOne(courseId);
    }
}
