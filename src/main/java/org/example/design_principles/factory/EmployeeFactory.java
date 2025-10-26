package org.example.design_principles.factory;

public class EmployeeFactory {
    static Employee getEmployee(String empType)
    {
        if(empType.equalsIgnoreCase("Java Developer"))
        {
            return new JavaDeveloper();
        }
        else if(empType.equals("Web Developer"))
        {
            return new WebDeveloper();
        }
        else return null;
    }
}
