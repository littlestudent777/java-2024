package com.classexample;
/*
class A {
    void foo() { System.out.println("A"); }
}

class B {
    void foo() { System.out.println("B"); }
}

// Inherting the Properties from
// Both the classes
class C extends A, B {
    // main function
    public static void main(String[] args) {
        C c = new C();
        c.foo();
    }
}
*/

interface A1 {
    void foo();
}

interface B1 {
    void foo();
}

class SuperClass implements A1, B1 {
    public void foo() {
        System.out.println("Inherited function");
    }
}

class Multiple {
    // main function
    public static void main(String[] args) {
        SuperClass c = new SuperClass();
        c.foo();
    }
}