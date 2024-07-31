package oyetaxi.liveride_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oyetaxi.liveride_service.entity.Driver;
import oyetaxi.liveride_service.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService r) {
        driverService = r;
    }

    @GetMapping("/")
    public String greet() {

        return "Driver page.";
    }

    @PostMapping("/create")
    public String create() {
        Driver driver = driverService.createDriver();
        return driver.toString() + " Driver created.";
    }

    @GetMapping("/all")
    public List<Driver> all() {
        return driverService.getAllDriver();
    }

    @GetMapping("/{id}")
    public Driver getDriver(@PathVariable String id) {
        return driverService.getDriver(id);
    }
}
