package pl.quayal.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
