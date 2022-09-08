package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")

public class Employee {

    //Atributos y columnas de entidades

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToOne()
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    private enum role{
        Manager,
        Operative;
    }

    @Column(name = "role")
    private role roleName;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transaction1;

    // Constructor vacio
    public Employee() {
    }

    // Constructor con parametros
    public Employee(long id, String name, String email,Enterprise enterprise, role roleName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.roleName = roleName;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public role getRoleName() {
        return roleName;
    }

    public void setRoleName(role roleName) {
        this.roleName = roleName;
    }
}
