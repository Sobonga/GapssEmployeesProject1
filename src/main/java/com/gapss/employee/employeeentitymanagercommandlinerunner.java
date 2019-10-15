package com.gapss.employee;

import com.gapss.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class EmployeeEntityManagerCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(EmployeeEntityManagerCommandLineRunner.class);

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String...args) {
        log.info("-------------------------------");

    }
}
