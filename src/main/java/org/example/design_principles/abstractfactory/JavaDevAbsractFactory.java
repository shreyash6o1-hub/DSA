package org.example.design_principles.abstractfactory;

public class JavaDevAbsractFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
