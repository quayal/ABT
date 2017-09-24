package pl.quayal.app.service;

import org.springframework.stereotype.Service;
import pl.quayal.app.model.Trainer;
import pl.quayal.app.repository.TrainerRepository;

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
