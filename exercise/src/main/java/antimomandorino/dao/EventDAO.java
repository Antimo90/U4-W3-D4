package antimomandorino.dao;

import antimomandorino.entities.Event;
import antimomandorino.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class EventDAO {

    private final EntityManager entityManager;

    public EventDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Event newEvent) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvent);
        transaction.commit();
        System.out.println("L'evento  " + newEvent.getTitle() + " è stato salvato correttamente!");
    }

    public Event findById(String eventId) {
        Event found = entityManager.find(Event.class, UUID.fromString(eventId));
        if (found == null) throw new NotFoundException("Event ", eventId);
        return found;
    }

    //  public void delete(String eventId) {
//
    //      Event found = this.findById(eventId);
    //   EntityTransaction transaction = entityManager.getTransaction();
    //   transaction.begin();
    //   entityManager.remove(found);
    //   transaction.commit();
    //   System.out.println("L'evento " + found.getTitle() + " è stato rimosso correttamente!");
    //  }
}
