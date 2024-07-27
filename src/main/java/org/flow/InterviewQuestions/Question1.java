package org.flow.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
//        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
//        For given list of employees,
//        Calculate sum of those employee salary whose age > 25, using java8 stream

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));


        double d = employeeList.stream().filter(t->t.age>25).mapToDouble(e->e.salary).sum();
        System.out.println("Salary summed: " + d);
    }
}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String profile;
    int doj;
    double salary;

    public Employee(int id, String name, int age, String gender, String profile, int doj, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profile = profile;
        this.doj = doj;
        this.salary = salary;
    }
}
