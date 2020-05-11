package com.managementSystem.service;

import com.managementSystem.entity.Employee;

public interface IEmployeeService {

    Employee getById(int id);
    Employee getByName(String firstName);
    void save(Employee employee);
    boolean remove(Employee employee);

}
