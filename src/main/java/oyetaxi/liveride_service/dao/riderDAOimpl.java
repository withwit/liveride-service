package oyetaxi.liveride_service.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import oyetaxi.liveride_service.entity.Rider;

import java.util.List;
import java.util.UUID;

@Repository
public class riderDAOimpl implements riderDAO {

    private EntityManager entityManager;

    @Autowired
    riderDAOimpl(EntityManager em) {
        entityManager = em;
    }


    @Override
    public Rider createRider() {
        Rider _rider = new Rider();
        String _id = "r_" + UUID.randomUUID().toString().split("-")[0];

        while (getRider(_id) != null) {
            _id = "r_" + UUID.randomUUID().toString().split("-")[0];
        }
        _rider.setId(_id);
        _rider.setName("Test");
        _rider.setRide("");
        _rider.setCurloc("");
        _rider.setActive(Boolean.TRUE);

        entityManager.persist(_rider);

        return _rider;
    }

    @Override
    public List<Rider> getAllRider() {
        // the query table name is not sql table but the entity name.
        TypedQuery<Rider> query = entityManager.createQuery("from Rider", Rider.class);
        List<Rider> res = query.getResultList();
        return res;
    }

    @Override
    public Rider getRider(String id) {
        return entityManager.find(Rider.class, id);
    }

    @Override
    public String updateLoc(String id, String loc) {
        Rider _rider = entityManager.find(Rider.class, id);
        _rider.setCurloc(loc);
        entityManager.merge(_rider);
        return _rider.toString();
    }
}
