package oyetaxi.liveride_service.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oyetaxi.liveride_service.dao.driverDAO;
import oyetaxi.liveride_service.entity.Driver;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    private driverDAO driverdao;

    @Autowired
    public DriverServiceImpl(driverDAO d) {
        driverdao = d;
    }

    @Transactional
    @Override
    public Driver createDriver() {
        return driverdao.createDriver();
    }

    @Override
    public List<Driver> getAllDriver() {
        return driverdao.getAllDriver();
    }

    @Override
    public Driver getDriver(String id) {
        return driverdao.getDriver(id);
    }
}
