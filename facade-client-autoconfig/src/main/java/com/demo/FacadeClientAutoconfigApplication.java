package com.demo;

import com.demo.entity.Employee;
import com.demo.facade.EmployeeFacadeLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeClientAutoconfigApplication implements CommandLineRunner {
    @Autowired
    private EmployeeFacadeLocal employeeFacade;

    public static void main(String[] args) {
        SpringApplication.run(FacadeClientAutoconfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee =
                new Employee(1,"John","Doe","john@gmail.com",3000);

        employeeFacade.create(employee);
        Employee employee1= employeeFacade.findById(1);
        System.out.println(employee1);
    }
}
