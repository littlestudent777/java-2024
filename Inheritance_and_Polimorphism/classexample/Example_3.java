package com.classexample;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class Example_3 {
    public static void main(String[] args) {
        // Polymorphism allows to use a Shape reference to work with objects
        // of different classes that implement this interface
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
