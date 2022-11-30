import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SenderController {

    @Autowired
    AmqpTemplate template;

    @RequestMapping("/send")
    @ResponseBody
    String queue(){
        System.out.println("Send to queue");
        template.convertAndSend("queue","mymessage");
        return "Send to queue";
    }
}
