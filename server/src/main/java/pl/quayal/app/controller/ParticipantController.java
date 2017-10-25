package pl.quayal.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.quayal.app.model.Participant;
import pl.quayal.app.service.ParticipantService;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    private ParticipantService participantService;

    public ParticipantController (ParticipantService participantService){
        this.participantService = participantService;
    }

    @GetMapping("/{participantId}")
    public Participant getParticipant(@PathVariable("participantId") Long participantId){
        return participantService.getParticipant(participantId);
        }

}
