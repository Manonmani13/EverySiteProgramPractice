package com.solid.principles.solid_principles_example1.SinglePrinciples;

public class SalaryCalculation {
    

    public Double calculateSalary(Employee employee) {
        // Here we can add more complex salary calculation logic if needed
        return employee.getSalary()*1.2;
    }
}
