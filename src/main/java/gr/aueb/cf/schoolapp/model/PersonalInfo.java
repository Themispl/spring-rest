package gr.aueb.cf.schoolapp.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "personal_information")
public class PersonalInfo extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "amka_file_id")
    private Attachment amkaFile;

    private String amka;
    private String identityNumber;
    private String placeOfBirth;
    private String municiplOfRegistretion;

    public PersonalInfo(LocalDateTime createdAt, LocalDateTime updatedAt,
                        Long id, String amka, String identityNumber,
                        String placeOfBirth, String municiplOfRegistretion) {

        this.id = id;
        this.amka = amka;
        this.identityNumber = identityNumber;
        this.placeOfBirth = placeOfBirth;
        this.municiplOfRegistretion = municiplOfRegistretion;
    }


}
