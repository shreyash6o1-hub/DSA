package org.example.design_principles.abstractfactory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "I am a Web Developer";
    }
}
