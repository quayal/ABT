package pl.quayal.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.quayal.app.model.Trainer;
import pl.quayal.app.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private TrainerService trainerService;

    public TrainerController (TrainerService trainerService) {
            this.trainerService = trainerService;
        }

    @PostMapping
    public Trainer addTrainer(@RequestBody Trainer trainerToAdd) {

        return trainerService.addTrainer(trainerToAdd);

    }

}
