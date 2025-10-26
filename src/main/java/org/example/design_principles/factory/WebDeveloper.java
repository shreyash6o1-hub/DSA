package org.example.design_principles.factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Web Developer salary");
        return 50000;
    }
}
