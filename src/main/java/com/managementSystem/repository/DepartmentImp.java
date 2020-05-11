package com.managementSystem.repository;

import com.managementSystem.entity.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DepartmentImp implements IDepartmentRepo {

    @PersistenceContext
    private EntityManager em;

    public DepartmentImp() {
    }

    public DepartmentImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public Department getDepartmentById(int id) {
        return em.find(Department.class, id);
    }
}
