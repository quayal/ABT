package pl.quayal.app.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.quayal.app.server.model.Trainer;
import pl.quayal.app.server.repository.TrainerRepository;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    public Trainer addTrainer(Trainer trainer){
        return trainerRepository.save(trainer);
    }
}
