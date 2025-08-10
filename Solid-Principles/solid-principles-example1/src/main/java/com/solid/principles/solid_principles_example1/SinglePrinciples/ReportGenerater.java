package com.solid.principles.solid_principles_example1.SinglePrinciples;

public class ReportGenerater {
    public void generateReport(Employee employee) {
        System.out.println("Generating report for: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
