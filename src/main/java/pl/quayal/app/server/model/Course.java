package pl.quayal.app.server.model;


import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Trainer trainer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Facilitator facilitator;


    public Course(String name, Trainer trainer, Facilitator facilitator) {
        this.name = name;
        this.trainer = trainer;
        this.facilitator = facilitator;
    }
}
