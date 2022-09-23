package com.bomed.programing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enterprise {

    @Id
    private long id;

    @OneToMany
    private Employee employee;
}
