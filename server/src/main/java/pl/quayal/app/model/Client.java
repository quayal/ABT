package pl.quayal.app.model;

import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;

    private String email;

    private String phoneNumber;

    @OneToMany(mappedBy = "client")
    private Set<Course> courses = new HashSet<>();
}
