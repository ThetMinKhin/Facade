package com.demo.facade;

import com.demo.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeFacade extends AbstractFacade<Employee>
        implements EmployeeFacadeLocal {

    public EmployeeFacade(){
        super(Employee.class);
    }
}
