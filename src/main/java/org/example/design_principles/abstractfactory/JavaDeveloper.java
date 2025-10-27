package org.example.design_principles.abstractfactory;

import org.example.design_principles.abstractfactory.Employee;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        return "I am a Java Developer";
    }
}
