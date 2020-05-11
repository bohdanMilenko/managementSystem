package com.managementSystem.service;

import com.managementSystem.entity.Employee;
import com.managementSystem.repository.EmployeeRepoImpl;
import com.managementSystem.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    Logger logger = new Logger();

    public EmployeeServiceImpl(IEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee getById(int id) {
        return employeeRepo.getEmployeeById(id);
    }

    @Override
    public Employee getByName(String firstName) {
        return employeeRepo.getEmployeeByName(firstName);
    }
}
