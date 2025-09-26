package antimomandorino;

import antimomandorino.entities.Event;
import antimomandorino.entities.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        //   EventDAO ed = new EventDAO(em);

        //   PersonDAO pd = new PersonDAO(em);
        //   LocationDAO ld = new LocationDAO(em);

        //   ParticipationDAO pa = new ParticipationDAO(em);

        Event concert = new Event("Concerto Rock", LocalDate.of(2025, 12, 15), "Un grande concerto con band famose.", EventType.PUBLIC, 500);
        Event conference = new Event("Conferenza sulla IA", LocalDate.of(2026, 3, 22), "Conferenza per esplorare le ultime novità sull'intelligenza artificiale.", EventType.PUBLIC, 150);
        Event workshop = new Event("Workshop di pittura", LocalDate.of(2025, 11, 5), "Impara le tecniche base della pittura ad olio.", EventType.PRIVATE, 20);


        //   Person p = new Person("Mario", "Rossi", "mario.rossi@example.com", LocalDate.of(1990, 5, 20), GenderType.M);
        //   Location l = new Location("Teatro Verdi", "Milano");
        //   Event e = new Event("Concerto", LocalDate.now(), "Concerto di musica classica", EventType.PUBLIC, 200);


        //    ld.save(l);

        //    e.setLocation(l);

        //    pd.save(p);

        //    ed.save(e);

        //     Participation participation = new Participation(p, e, StateType.CONFIRMED);

        //    pa.save(participation);
        //ed.save(concert);
        //  ed.save(conference);
        // ed.save(workshop);

//        try {
//            Event concertFromDB = ed.findById(1);
//            System.out.println(concertFromDB);
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

        //  try {
        //      ed.delete(2);
        //  } catch (NotFoundException ex) {
        //      System.out.println(ex.getMessage());
        //  }


        em.close();
        emf.close();
    }
}
