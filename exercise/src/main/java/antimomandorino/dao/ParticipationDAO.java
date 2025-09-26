package antimomandorino.dao;

import antimomandorino.entities.Participation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class ParticipationDAO {

    private final EntityManager em;

    public ParticipationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Participation newParticipation) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newParticipation);
        transaction.commit();
        System.out.println("Nuova partecipazione  salvata!");
    }

    public Participation findById(String participationId) {
        return em.find(Participation.class, UUID.fromString(participationId));
    }
}
