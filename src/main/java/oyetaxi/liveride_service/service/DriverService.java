package oyetaxi.liveride_service.service;

import oyetaxi.liveride_service.entity.Driver;

import java.util.List;

public interface DriverService {
    Driver createDriver();

    List<Driver> getAllDriver();

    Driver getDriver(String id);
}
