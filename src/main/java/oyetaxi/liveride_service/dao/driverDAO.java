package oyetaxi.liveride_service.dao;

import oyetaxi.liveride_service.entity.Driver;

import java.util.List;

public interface driverDAO {
    Driver createDriver();

    List<Driver> getAllDriver();

    Driver getDriver(String id);
}
