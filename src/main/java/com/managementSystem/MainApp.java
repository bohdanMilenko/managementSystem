package com.managementSystem;


import com.managementSystem.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        IEmployeeService employeeService = applicationContext.getBean(IEmployeeService.class);
        System.out.println(employeeService.getById(1).toString());

    }

}
