package com.methods;

public class Method2 {


    public static void main(String[] args) {
//        Method2 obj1 = new Method2();
        int result = sumOfTwoNumbers(4,4);
//        System.out.println(r1);
        print(result);
    }

    static int sumOfTwoNumbers (int x, int y) {

        int addition = x + y;
        return addition;
    }

    static void print (int result) {
        System.out.println("Result :" + result);

    }

}
