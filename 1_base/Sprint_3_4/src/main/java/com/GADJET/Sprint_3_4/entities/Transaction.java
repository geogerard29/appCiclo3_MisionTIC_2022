package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    //Atributos
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "amount")
    private double amount;
    @Column(name = "employee")
    private String employee;
    @Column(name = "concept")
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
    public Transaction(long id, Double amount, String employee, String concept, typeTran type) {
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
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
