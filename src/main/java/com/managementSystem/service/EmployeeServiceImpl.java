package com.managementSystem.service;

import com.managementSystem.entity.Employee;
import com.managementSystem.repository.IEmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    public EmployeeServiceImpl(IEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee getById(int id) {
        logger.info("Getting Employee by id");
        return employeeRepo.getEmployeeById(id);
    }

    @Override
    public Employee getByName(String firstName) {
        return employeeRepo.getEmployeeByName(firstName);
    }
}
