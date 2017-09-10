package pl.quayal.app.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "mainTrainer", cascade = CascadeType.ALL)
    private Set<Course> coursesLed;

    @OneToMany(mappedBy = "secondTrainer", cascade = CascadeType.ALL)
    private Set<Course> coursesFacilitated;
}
