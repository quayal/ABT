package pl.quayal.app.service;


import org.springframework.stereotype.Service;
import pl.quayal.app.model.Course;
import pl.quayal.app.model.Trainer;
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

    public Course addCourse(Course courseToSave) {
        return courseRepository.save(courseToSave);
    }

    public Course updateCourse(Long id, Trainer trainerToAdd){
        Course courseToUpdate = courseRepository.findOne(id);
        courseToUpdate.setTrainer(trainerToAdd);
        return courseRepository.save(courseToUpdate);
    }
}
