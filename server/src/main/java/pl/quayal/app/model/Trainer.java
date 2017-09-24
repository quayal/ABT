package pl.quayal.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @OneToMany(mappedBy = "trainer", orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Course> courses;

    @OneToMany(mappedBy = "facilitator", orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Course> coursesFacilitated;

}
