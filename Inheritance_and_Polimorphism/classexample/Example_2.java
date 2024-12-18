package com.classexample;

class Person {
    private String name;

    public Person(String name) {
        // this indicates that the variable of the class is called, not the method
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    public Employee(String name) {
        // Thus, the assignment of the name field value is delegated to the base class constructor
        super(name);
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam");
        sam.display();
    }
}
