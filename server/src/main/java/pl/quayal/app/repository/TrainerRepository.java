package pl.quayal.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository <Trainer, Long> {
}
