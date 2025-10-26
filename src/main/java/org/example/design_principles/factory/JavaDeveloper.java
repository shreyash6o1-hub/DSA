package org.example.design_principles.factory;

public class JavaDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Java Developer salary");
        return 90000;
    }
}
