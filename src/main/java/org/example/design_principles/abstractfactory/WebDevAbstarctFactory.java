package org.example.design_principles.abstractfactory;

public class WebDevAbstarctFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
