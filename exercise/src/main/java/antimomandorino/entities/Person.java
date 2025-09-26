package antimomandorino.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "person_id", nullable = false)
    private UUID id;
    private String name;
    private String surname;
    private String email;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    private GenderType gender;

    @OneToMany(mappedBy = "person")
    private List<Participation> participation_list;


    public Person() {

    }

    public Person(String name, String surname, String email, LocalDate dateOfBirth, GenderType gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public List<Participation> getParticipation_list() {
        return participation_list;
    }

    public void setParticipation_list(List<Participation> participation_list) {
        this.participation_list = participation_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }
}
