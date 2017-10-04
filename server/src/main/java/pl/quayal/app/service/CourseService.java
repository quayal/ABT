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

    public Course getCourse(Long courseId) {
        return courseRepository.findOne(courseId);
    }

    public Course saveCourse(Course courseToSave) {
        return courseRepository.save(courseToSave);
    }
}
