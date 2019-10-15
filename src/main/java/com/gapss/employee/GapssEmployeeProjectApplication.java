package com.gapss.employee;

import com.gapss.employee.dao.EmployeeDao;
import com.gapss.employee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GapssEmployeeProjectApplication implements CommandLineRunner {

    @Autowired
    private EmployeeDao employeeDao;
    public static void main(String[] args) {
        SpringApplication.run(GapssEmployeeProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = getEmployee();
        employeeDao.createEmployee(employee);
    }

    private Employee getEmployee(){
        Employee e = new Employee();
        e.setUnit("unit");
        e.setFirstName("firstName");
        e.setSurname("surname");
        e.setJobTitle("jobTitle");
        e.setEmploymentStatus("employmentStatus");
        e.setEducation("education");
        e.setTechnicalTraining("technicalTraining");
        e.setSoftSkills("softSkills");
        return e;
    }
}
