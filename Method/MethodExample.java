package com.Method;

public class MethodExample {

    int a = 10; // Instance variable
    static int b = 20; // Static /class variable

    public static void main(String[] args) {

//        int a = 30; // local variable --> Scope is within a method, constructor and block
//
//        MethodExample refVar = new MethodExample(); // When var is Non-Static then we need to create an instance in order to access that var
//        System.out.println(refVar.a); // user Reference varName followed by .(dot) operator and Non-static varName

        System.out.println(MethodExample.b); // As this is a static / class var we can access it without creating an object
//        System.out.println(a);

    }

}
