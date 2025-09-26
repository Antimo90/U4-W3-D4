package antimomandorino.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Participation {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Person person;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private StateType state;

    public Participation(Person person, Event event, StateType state) {

        this.person = person;
        this.event = event;
        this.state = state;
    }

    public Participation() {

    }

    public UUID getId() {
        return id;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
    }

}
