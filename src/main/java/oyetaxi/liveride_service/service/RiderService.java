package oyetaxi.liveride_service.service;


import oyetaxi.liveride_service.entity.Rider;

import java.util.List;

public interface RiderService {
    Rider createRider();

    List<Rider> getAllRider();

    Rider getRider(String id);
}
