package com.bomed.sprint3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    private Long id;

    @OneToOne
    private Profile profile;
}
