package oyetaxi.liveride_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping("/")
    public String greet() {

        return "Homepage.";
    }
}
