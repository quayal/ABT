package pl.quayal.app.server.model;


import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Trainer mainTrainer;

    @ManyToOne
    @JoinColumn
    private Trainer secondTrainer;

    public Course (String name, Trainer mainTrainer, Trainer secondTrainer) {

        this.name = name;
        this.mainTrainer = mainTrainer;
        this.secondTrainer = secondTrainer;

    }

    public Course(String name, Trainer mainTrainer) {
        this.name = name;
        this.mainTrainer = mainTrainer;
    }
}
