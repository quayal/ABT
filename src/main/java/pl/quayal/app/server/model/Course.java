package pl.quayal.app.server.model;


import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Trainer mainTrainer;

    @ManyToOne(cascade = CascadeType.ALL)
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
