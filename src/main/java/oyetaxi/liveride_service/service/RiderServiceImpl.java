package oyetaxi.liveride_service.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oyetaxi.liveride_service.dao.riderDAO;
import oyetaxi.liveride_service.entity.Rider;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {

    private riderDAO riderDAO;

    @Autowired
    public RiderServiceImpl(riderDAO r) {
        riderDAO = r;
    }

    @Transactional
    @Override
    public Rider createRider() {
        return riderDAO.createRider();
    }

    @Override
    public List<Rider> getAllRider() {
        return riderDAO.getAllRider();
    }

    @Override
    public Rider getRider(String id) {
        return riderDAO.getRider(id);
    }
}
