package oyetaxi.liveride_service.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oyetaxi.liveride_service.service.RideService;

@RestController
@RequestMapping("/ride")
@AllArgsConstructor
@NoArgsConstructor
public class RideController {
    @Autowired
    private RideService rideService;

    @GetMapping("/")
    public String Hello() {
        return "Wc";
    }

    @GetMapping("/create")
    public String Create() {
        return "Ride created: " + rideService.createRide().toString();
    }
}
