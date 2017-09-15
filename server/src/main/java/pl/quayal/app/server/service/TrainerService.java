package pl.quayal.app.server.service;

import org.springframework.stereotype.Service;
import pl.quayal.app.server.model.Trainer;
import pl.quayal.app.server.repository.TrainerRepository;

@Service
public class TrainerService {

    private TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer addTrainer(Trainer trainer){
        return trainerRepository.save(trainer);
    }
}
