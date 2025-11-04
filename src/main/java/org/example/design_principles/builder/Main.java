package org.example.design_principles.builder;

public class Main {
    public static void main(String args[])
    {
       Employee e1 =  new Employee.EmployeeBuilder().setName("Shreyash").build();
       Employee e2 =  new Employee.EmployeeBuilder().setName("Jude").setId(123).build();
       System.out.println(e1);
        System.out.println(e2);
    }
}
