package ie.atu;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @RequestMapping("/Notify")
    public String notifyUser(@RequestBody UserDetails userDetails) {
        String notifyMessage = userDetails.getMessage();
        return notifyMessage;
    }

}
