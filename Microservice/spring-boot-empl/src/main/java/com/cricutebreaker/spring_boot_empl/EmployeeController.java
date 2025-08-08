package com.cricutebreaker.spring_boot_empl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {

    @Autowired
    private NameService nameService;

    @GetMapping("/employee")
    public Employee getEmployee() {
        String name=nameService.getEmployeeName();
        return new Employee(name, 50000);
    }
    
}
