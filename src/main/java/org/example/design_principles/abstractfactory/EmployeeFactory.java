package org.example.design_principles.abstractfactory;

public class EmployeeFactory {

    public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory)
    {
        return abstractEmployeeFactory.createEmployee();

    }
}
