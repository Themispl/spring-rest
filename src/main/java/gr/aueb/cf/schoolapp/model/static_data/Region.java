package gr.aueb.cf.schoolapp.model.static_data;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Getter(AccessLevel.PRIVATE)
    @OneToMany(mappedBy = "region")
    private Set<EducationalUnit> eduUnits = new HashSet<>();

    public Set<EducationalUnit> getEducationalUnits() {
        if(eduUnits == null) eduUnits =new HashSet<>();
        return Collections.unmodifiableSet(eduUnits);
    }

}
