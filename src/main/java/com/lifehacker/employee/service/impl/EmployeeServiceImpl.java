package com.lifehacker.employee.service.impl;


import com.lifehacker.employee.model.Employee;
import com.lifehacker.employee.service.EmployeeService;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext(name = "EmployeeApp")
    private EntityManager em;

    @Override
    public void addEmployee(Employee emp) {
        em.persist(emp);
    }

}