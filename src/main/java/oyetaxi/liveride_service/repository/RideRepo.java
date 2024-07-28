package oyetaxi.liveride_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import oyetaxi.liveride_service.entity.Ride;

public interface RideRepo extends MongoRepository<Ride,String> {
}
