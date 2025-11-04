package org.example.design_principles.builder;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;
    private String location;


     Employee(){

    }

    public static class EmployeeBuilder{

         private int id;
         private String name;
         private double salary;
         private String department;
         private String location;

         public EmployeeBuilder setId(int id)
         {
            this.id = id;
            return this;
         }
         public EmployeeBuilder setName(String name)
         {
             this.name = name;
             return this;
         }

         public Employee build(){
             Employee e = new Employee();
             e.id = this.id;
             e.name = this.name;
             return e;
         }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
