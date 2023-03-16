package com.demo;

import com.demo.entity.Employee;
import com.demo.facade.EmployeeFacadeLocal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeFacadeLocal employeeFacade =
                context.getBean(EmployeeFacadeLocal.class);
        Employee employee =new Employee(1,"Thaw","Thaw","thaw@gmail.com",1000);
        employeeFacade.create(employee);
        Employee employee1=employeeFacade.findById(1);
        System.out.println(employee1);
    }
}
