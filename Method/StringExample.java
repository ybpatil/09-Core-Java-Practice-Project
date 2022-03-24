package com.Method;

public class StringExample {

    public static void main(String[] args) {

        StringExample rf = new StringExample();
        String message = rf.greet();
        System.out.println(message);

    }

     String greet() {
        String greeting = "How are you ?";
        return greeting;
//        System.out.println(greeting); // This is Unreachable statement

    }
}
