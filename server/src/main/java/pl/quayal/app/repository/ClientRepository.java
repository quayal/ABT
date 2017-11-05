package pl.quayal.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.quayal.app.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
