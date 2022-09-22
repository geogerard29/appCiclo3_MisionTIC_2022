package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {

    //Atributos
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "concept", nullable = false)
    private String concept;

    private enum typeTran{
        Incomes,
        Expenses
    }

    @Column(name = "type")
    typeTran type;

    //Constructor vacio
    public Transaction() {
    }

    //Constructor con parametros
    public Transaction(long id, double amount, Employee employee, String concept, typeTran type) {
        this.id = id;
        this.amount = amount;
        this.employee = employee;
        this.concept = concept;
        this.type = type;
    }

    //Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public typeTran getType() {
        return type;
    }

    public void setType(typeTran type) {
        this.type = type;
    }
}
