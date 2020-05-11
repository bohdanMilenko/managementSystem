package com.managementSystem.repository;

import com.managementSystem.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo {

    @PersistenceContext
    EntityManager em;

    public EmployeeRepoImpl() {
    }

    public EmployeeRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return em.find(Employee.class, id);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        Employee employee = em.createQuery("SELECT e.firstName, e.lastName, " +
                "e.dep_id  FROM Employee e WHERE e.firstName = :name", Employee.class).getSingleResult();
        return employee;
    }
}
