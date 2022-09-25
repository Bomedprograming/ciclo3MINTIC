package com.bomed.sprint3.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String  email;
    private Enum_RoleName role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_employee")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "enterprise_employee")
    private Enterprise enterprise;

    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactions;

    private Date createdAt;
    private Date updatedAt;


    //CONSTRUCTORES
    public Employee() {
    }

    public Employee(Long id, String email, Enum_RoleName role, Profile profile, Enterprise enterprise, List<Transaction> transactions, Date createdAt, Date updatedAt) {
        this.id = id;
        this.email = email;
        this.role = role;
        this.profile = profile;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
