package com.sample.project.controller;

import com.sample.project.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/employee")
    public String getGoodGreetings(){
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Divya");
        employee.setAddress("Otto Sogns Vei 17");

        Employee em = new Employee();
        em.setId(213);
        em.setName("Nithin");
        em.setAddress("Otto Sogns Vei 17");

        return employee.toString()+em.toString()+em.toString()+ " Good Greetings from my sample project!!!! \n";

    }

    @GetMapping("/bad-grettings")
    public String getGreetings(){

        return "Bad Greetings from my sample project!!!! \n";
    }
}
