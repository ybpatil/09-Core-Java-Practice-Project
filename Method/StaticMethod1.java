package com.methods;

public class StaticMethod1 {

    static double product (int x, double y) {
        double prod = x * y;
        return prod;
    }

    int division (int x, int y) {
        int div = x / y;
        return div;
    }

    void addition (int x, int y) {
        int add = x + y;
        System.out.println(add);
    }

//
//    public static void main(String[] args) {
//       double result = StaticMethod1.product(4,4.4);
//        System.out.println(result);
}


