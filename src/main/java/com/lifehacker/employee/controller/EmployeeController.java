package com.lifehacker.employee.controller;


import com.lifehacker.employee.model.Employee;
import com.lifehacker.employee.service.EmployeeService;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class EmployeeController {

    private Employee employee = new Employee();

    @EJB
    private EmployeeService service;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void saveEmployee(Employee emp) {
        service.addEmployee(emp);
    }

}