package pl.quayal.app.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.server.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository <Trainer, Long> {
}
