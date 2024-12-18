package com.classexample;

class BaseClass  {
    private void m1() {
        System.out.println("Base class m1 method");
    }
    protected void m2() {
        System.out.println("Base class m2 method");
    }
}
class DerivedClass extends BaseClass {

}
public class Access {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.m2();
    }
}