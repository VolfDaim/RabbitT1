package org.springframework.amqp.tutorials.rabbitmqamqptutorials.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
