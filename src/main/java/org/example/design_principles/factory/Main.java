package org.example.design_principles.factory;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("java Developer");
        System.out.println(employee.salary());
    }
}
