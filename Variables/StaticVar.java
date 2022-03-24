package com.Variables;

public class StaticVar {

    //Static variable
    static int a = 10;

    static void m1 (int x, int y ) {

        int sum = x + y;
//        return sum;
        System.out.println(sum);
    }


    public static void main(String[] args) {

//        StaticVar obj1 = new StaticVar();
//        System.out.println(obj1.a);
//
//        StaticVar obj2 = new StaticVar();
//        System.out.println(obj2.a);

        StaticVar obj3 = new StaticVar();
//        int result =  obj3.m1(2,2);
//        System.out.println(result);
        obj3.m1(2,4);
        m1(45,45);


        StaticVar obj4 = new StaticVar();
//        int result1 =  obj4.m1(3,2);
//        System.out.println(result1);
        obj4.m1(5,5);


//        System.out.println(StaticVar.a);

    }
}
