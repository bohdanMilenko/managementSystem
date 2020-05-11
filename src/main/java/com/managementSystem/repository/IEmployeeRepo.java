package com.managementSystem.repository;

import com.managementSystem.entity.Employee;

public interface IEmployeeRepo {

    Employee getEmployeeById(int id);
    Employee getEmployeeByName(String name);
    void save(Employee employee);
    boolean remove(Employee employee);
    boolean remove(int id);


}
