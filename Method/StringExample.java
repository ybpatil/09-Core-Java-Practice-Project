package com.methods;

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

class A {

    public static void main(String[] args) {
        double result = StaticMethod1.product(4, 4.4);
        System.out.println(result);

        StaticMethod1 ref = new StaticMethod1();
        int resultOfdiv =  ref.division(30,10);
        System.out.println(resultOfdiv);

        ref.addition(34,34);

    }
}
