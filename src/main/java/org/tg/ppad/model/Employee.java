package org.tg.ppad.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Entity
@Table(name = "employees")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "email_address", nullable = false)
    private String emailId;

    @Transient
    private String headers[];

    @Transient
    private List<Map<String,Object>> employeeList;


}