package pl.quayal.app.service;

import org.springframework.stereotype.Service;
import pl.quayal.app.model.Participant;
import pl.quayal.app.repository.ParticipantRepository;

@Service
public class ParticipantService {

    private ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }
    public Participant getParticipant(Long participantId){
        return participantRepository.findOne(participantId);
    }
}
