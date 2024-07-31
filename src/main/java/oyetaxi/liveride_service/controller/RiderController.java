package oyetaxi.liveride_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oyetaxi.liveride_service.entity.Rider;
import oyetaxi.liveride_service.service.RiderService;

import java.util.List;

@RestController
@RequestMapping("/rider")
public class RiderController {
    private final RiderService riderService;

    @Autowired
    public RiderController(RiderService r) {
        riderService = r;
    }

    @GetMapping("/")
    public String greet() {

        return "Rider page.";
    }

    @PostMapping("/create")
    public String createRider() {
        Rider rider = riderService.createRider();
        return rider.toString() + " Rider created.";
    }

    @GetMapping("/all")
    public List<Rider> getAllRider() {
        return riderService.getAllRider();
    }

    @GetMapping("/{id}")
    public Rider getRider(@PathVariable String id) {
        return riderService.getRider(id);
    }
}
