package antimomandorino.dao;

import antimomandorino.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDAO {

    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location newLocation) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newLocation);
        transaction.commit();
        System.out.println("Nuova location  salvata!");
    }

    public Location findById(String locationId) {
        Location found = em.find(Location.class, UUID.fromString(locationId));
        if (found == null) {
            throw new RuntimeException("Location con ID " + locationId + " non trovata!");
        }
        return found;
    }
}
