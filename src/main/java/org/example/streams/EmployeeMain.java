package org.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String [] args)
    {

        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getEmployeeData();

        //  Task 1 -> Number of male and female in list
        Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map);

        //  Task 2 -> Print Distinct department in the list
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //  Task 3 -> Average age of male and female employee
        Map<String, Double> avgAge =  employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average ages are "+ avgAge);

        //  Task 4 -> Highest paid employee in the organization
       System.out.println( employees.stream().map(Employee::getSalary).max(Double::compare).get());
       System.out.println(employees.stream().max((x,y) -> Double.compare(x.getSalary() , y.getSalary())).get());

       // Task 5 -> Employee details who joined after 2015
        employees.stream().filter(employee -> employee.getYearOfJoining()>2015).forEach(System.out::println);

       //  Task 6  -> No of employees in each department
       Map <String, Long> deptCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
       System.out.println("Employee count per department " + deptCount);

       // Task 7 -> Department with highest emp count
        Map.Entry<String, Long> stringLongEntry = deptCount.entrySet().stream().max((d1, d2) -> Math.toIntExact(d1.getValue() - d2.getValue())).get();
        System.out.println(stringLongEntry);

        // Task 8 -> Average salary of each department;
       Map<String, Double> depAvgSal =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
       System.out.println("Average salary of each department is " + depAvgSal);

       // Task 9 -> Youngest Male employee in product development department
       Employee emp = employees.stream().filter(employee->employee.getGender().equalsIgnoreCase("male") && employee.getDepartment().equalsIgnoreCase("product development")).min((x,y)->x.getAge()-y.getAge()).get();
       System.out.println("Youngest employee in product development department is = " + emp);

        // Task 10 -> Most Working exp in an organization
        System.out.println(employees.stream().min((x,y) -> x.getYearOfJoining() - y.getYearOfJoining()).get());

        //Task 11 -> List of employee in each department
        Map<String, List<String>>mp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName,Collectors.toList())));

    }
}
