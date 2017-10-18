package pl.quayal.app.service;


import org.springframework.stereotype.Service;
import pl.quayal.app.model.Course;
import pl.quayal.app.model.Participant;
import pl.quayal.app.model.Trainer;
import pl.quayal.app.repository.CourseRepository;

import java.util.Set;

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

    public Course addTrainerToCourse(Long id, Trainer trainerToAdd){
        Course courseToUpdate = courseRepository.findOne(id);
        courseToUpdate.setTrainer(trainerToAdd);
        return courseRepository.save(courseToUpdate);
    }

    public Course addParticipantsToCourse(Long id, Set participantsToAdd) {
        Course courseToUpdate = courseRepository.findOne(id);
        courseToUpdate.addParticipants(participantsToAdd);
        return courseRepository.save(courseToUpdate);
    }

    public Course removeParticipantFromCourse(Long courseId, Long participantId) {
        Course courseToUpdate = courseRepository.findOne(courseId);
        courseToUpdate.removeParticipantFromCourse(participantId);
        return courseRepository.save(courseToUpdate);
    }
}
