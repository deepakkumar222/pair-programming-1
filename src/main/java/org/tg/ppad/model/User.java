package org.tg.ppad.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_pwd", nullable = false)
    private String userPwd;


}