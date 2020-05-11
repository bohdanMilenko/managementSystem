package com.managementSystem.repository;

import com.managementSystem.entity.Employee;

public interface IEmployeeRepo {

    Employee getEmployeeById(int id);
    Employee getEmployeeByName(String name);

}
