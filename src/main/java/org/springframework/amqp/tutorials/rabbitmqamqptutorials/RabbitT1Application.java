package org.springframework.amqp.tutorials.rabbitmqamqptutorials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.ObjectInputFilter;

@SpringBootApplication
public class RabbitT1Application {

    public static void main(String[] args) {
        SpringApplication.run(RabbitT1Application.class, args);
    }

}
