package com.managementSystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "department_id")
    private int dep_id;

//    Department department;


    public Employee(int id, String firstName, String lastName, int dep_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dep_id = dep_id;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    @Override
    public String toString() {
        return id+": " + firstName + " " + lastName;
    }
}
