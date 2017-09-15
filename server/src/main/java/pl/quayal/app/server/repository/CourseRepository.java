package pl.quayal.app.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.server.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
