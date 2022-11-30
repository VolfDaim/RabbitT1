package org.springframework.amqp.tutorials.rabbitmqamqptutorials.Contrller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    AmqpTemplate template;

    @GetMapping("/send")
    String queue(){
        System.out.println("Send to queue");
        template.convertAndSend("queueDima","mymessage");
        return "Send to queue";
    }
}
