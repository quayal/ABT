package pl.quayal.app.service;

import pl.quayal.app.model.Client;
import pl.quayal.app.repository.ClientRepository;

public class ClientService {

    private ClientRepository clientRepository;

    public Client createClient(Client clientToCreate) {
    return clientRepository.save(clientToCreate);
}

}
