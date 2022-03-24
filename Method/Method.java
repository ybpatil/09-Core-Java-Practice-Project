package com.Method;

import java.util.Scanner;

public class Method {

//    public int max (int x, int y) {
//
//        int max;
//        if (x > y)
//            max = x;
//        else
//            max = y;
//        return max;
//    }

      int voteEligibility () {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int age = in.nextInt();

        if (age >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
        return age;
    }


//    void age () {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1 :");
//        int c = sc.nextInt();
//        System.out.print("Enter num1 :");
//        int d = sc.nextInt();
//
//        int addition = c + d;
//        System.out.println("Addition is : "+ addition);
//
//    }

    public static void main(String[] args) {

//        Method maxNum = new Method();
//        int result = maxNum.max(88, 56);

//        System.out.println("Max num is : " + result);

        Method eligible = new Method();
        int haiEligible = eligible.voteEligibility();
        System.out.println(haiEligible);
//        voteEligibility();
//        voteEligibility();


//        Method add = new Method();
//        add.age();
    }
}
