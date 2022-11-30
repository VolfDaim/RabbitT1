package org.springframework.amqp.tutorials.rabbitmqamqptutorials.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name="user_name")
    String userName;
}
