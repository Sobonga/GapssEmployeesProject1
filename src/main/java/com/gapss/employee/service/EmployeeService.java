package com.gapss.employee.service;

import com.gapss.employee.entities.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Employee employee){
        entityManager.persist(employee);
        return employee.getId();
    }

    public Employee find(long id){
        return entityManager.find(Employee.class,id);
    }

    public List<Employee> findAll(){
        Query query = entityManager.createQuery(
                "query_find_all_employee", Employee.class
        );
        return query.getResultList();
    }
}
