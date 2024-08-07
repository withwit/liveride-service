package oyetaxi.liveride_service.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import oyetaxi.liveride_service.websockets.comm_model.LocResponse;

@Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/channel/ride")
    public LocResponse GetLocSendSubscription(LocResponse response) throws Exception {
        Thread.sleep(1000);

        LocResponse _res = new LocResponse();

//        _res.setAction("{\"action\":\"ride subscription\",\"data\":{\"curLoc\":\"driver loc\",\"destLoc\":\"Viman Nagar LIC, 211008, [1212.23,43.232]\"}}");

        _res.setAction("Yooo action here" );
        _res.setCurLoc("123.99,3333.3");
        _res.setDestLoc("Viman Nagar LIC, 211008,[1212.23,43.232]");

        return new LocResponse("->"+ HtmlUtils.htmlEscape(_res.getAction()));
    }

}
