package org.springframework.amqp.tutorials.rabbitmqamqptutorials.Rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "queueDima")
public class Receiver {

    @RabbitHandler
    public void receive(String in) {
        System.out.println("Received '" + in + "'");
    }
}
