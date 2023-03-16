package com.demo.facade;


import com.demo.entity.Employee;

public interface EmployeeFacadeLocal {
    void create(Employee e);
    void merge(Employee e);
    Employee findById(Object id);
}
