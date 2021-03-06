package pl.quayal.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.model.Participant;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
