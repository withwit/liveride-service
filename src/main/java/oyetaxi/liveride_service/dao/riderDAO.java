package oyetaxi.liveride_service.dao;

import oyetaxi.liveride_service.entity.Rider;

import java.util.List;

public interface riderDAO {
    Rider createRider();

    List<Rider> getAllRider();

    Rider getRider(String id);

    String updateLoc(String id, String loc);
}
