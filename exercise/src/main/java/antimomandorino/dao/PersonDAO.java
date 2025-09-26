package antimomandorino.dao;

import antimomandorino.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;


public class PersonDAO {
    private final EntityManager em;

    public PersonDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Person newPerson) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newPerson);
        transaction.commit();
        System.out.println("Persona " + newPerson.getName() + " salvata!");
    }

    public Person findById(String personId) {
        return em.find(Person.class, UUID.fromString(personId));
    }
}