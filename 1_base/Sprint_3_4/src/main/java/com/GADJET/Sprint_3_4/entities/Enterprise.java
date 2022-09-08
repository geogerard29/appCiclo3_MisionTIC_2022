package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "enterprise")
public class Enterprise {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "nit")
    private String nit;

    @Column(name = "phone")
    private long phone;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "enterprise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employee1;

    //Costructor vacio
    public Enterprise() {
    }
    //Metodo Constructor con parametros
    public Enterprise(long id, String name, String nit, long phone, String address, String city) {
        this.id = id;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }
    //Getter and Setters
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
