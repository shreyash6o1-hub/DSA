package org.example.design_principles.abstractfactory;

public class Main {


    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new JavaDevAbsractFactory());
        System.out.println(employee.name());
    }
}
