package pl.quayal.app.repository;

import org.springframework.data.repository.CrudRepository;
import pl.quayal.app.model.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
