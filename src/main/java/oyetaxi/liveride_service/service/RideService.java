package oyetaxi.liveride_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oyetaxi.liveride_service.entity.Ride;
import oyetaxi.liveride_service.repository.RideRepo;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class RideService {
    @Autowired
    private RideRepo rideRepo;

    public Ride createRide(){
        Ride ride= new Ride();
        ride.setId("r_"+UUID.randomUUID().toString().split("-")[0]);
        ride.setStatus("draft");
        ride.setTimestamp(LocalDateTime.now());
        rideRepo.save(ride);
        return  ride;
    }

}
