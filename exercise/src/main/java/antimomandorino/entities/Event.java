package antimomandorino.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "event_id", nullable = false)
    private UUID id;
    @Column(name = "title", nullable = false, length = 30)
    private String title;
    @Column(name = "date_event", nullable = false)
    private LocalDate date_event;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventType type;
    @Column(name = "maximum_number_of_participant", nullable = false)
    private int maximum_number;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "event") //
    private List<Participation> participation_list;

    public Event() {
    }

    public Event(String title, LocalDate date_event, String description, EventType type, int maximum_number) {
        this.title = title;
        this.date_event = date_event;
        this.description = description;
        this.type = type;
        this.maximum_number = maximum_number;
    }

    public UUID getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate_event() {
        return date_event;
    }

    public void setDate_event(LocalDate date_event) {
        this.date_event = date_event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getMaximum_number() {
        return maximum_number;
    }

    public void setMaximum_number(int maximum_number) {
        this.maximum_number = maximum_number;
    }

    public List<Participation> getParticipation_list() {
        return participation_list;
    }

    public void setParticipation_list(List<Participation> participation_list) {
        this.participation_list = participation_list;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date_event=" + date_event +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", maximum_number=" + maximum_number +
                ", location=" + location +
                ", participation_list=" + participation_list +
                '}';
    }
}
