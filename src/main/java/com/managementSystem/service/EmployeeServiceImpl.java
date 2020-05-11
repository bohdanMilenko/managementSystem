package com.managementSystem.service;

import com.managementSystem.entity.Employee;
import com.managementSystem.exception.ServiceException;
import com.managementSystem.repository.IEmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialException;
import javax.transaction.Transactional;

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

    @Override
    @Transactional
    public void save(Employee employee) {
        if (employee != null) {
            employeeRepo.save(employee);
        } else {
            RuntimeException e = new ServiceException("Unable to save Employee");
            logger.error("Passed object is null", e);
            throw e;
        }

    }

    @Override
    @Transactional
    public boolean remove(Employee employee) {
        logger.info("Trying to remove object Employee", employee);
        if (employee != null) {
            employeeRepo.remove(employee);
            return true;
        } else {
            RuntimeException e = new ServiceException("Unable to delete Employee");
            logger.error("Passed object is null", e);
            throw e;
        }
    }
}
