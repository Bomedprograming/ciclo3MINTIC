package com.bomed.programing.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private long id;

    @Column(name = "email",unique = true)
    private String email;

    @ManyToOne
    private Enterprise enterprise;

    private Date updateAt;
    private Date createAt;

    public Employee (){

    }

    public Employee(long id, String email, Enterprise enterprise, Date updateAt, Date createAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }
}
