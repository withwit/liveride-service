package oyetaxi.liveride_service.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import oyetaxi.liveride_service.entity.Driver;

import java.util.List;
import java.util.UUID;

@Repository
public class driverDAOimpl implements driverDAO {


    private EntityManager entityManager;

    @Autowired
    driverDAOimpl(EntityManager em) {
        entityManager = em;
    }


    @Override
    public Driver createDriver() {
        Driver _driver = new Driver();
        String _id = "d_" + UUID.randomUUID().toString().split("-")[0];

        while (getDriver(_id) != null) {
            _id = "d_" + UUID.randomUUID().toString().split("-")[0];
        }
        _driver.setId(_id);
        _driver.setName("Test");
        _driver.setRide("");
        _driver.setCurloc("");
        _driver.setActive(Boolean.TRUE);

        entityManager.persist(_driver);

        return _driver;
    }

    @Override
    public List<Driver> getAllDriver() {
        TypedQuery<Driver> query = entityManager.createQuery("from driver", Driver.class);
        return query.getResultList();
    }

    @Override
    public Driver getDriver(String id) {
        return entityManager.find(Driver.class, id);
    }
}
