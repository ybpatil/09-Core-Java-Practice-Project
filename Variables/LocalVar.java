package com.Variables;

public class LocalVar {
    /*
Types of Variables in Java and it's scope:

There are three types of variable in java as below:
1) Local variable
2) Instance variable
3) Static / class variable

* Local Variable:

// Local variables  - Local variables are declared inside methods, constructor or block
// local variables can be accessed within method, constructor or block only and are destroyed once program is executed
// local variables will not have any default value like instance or static / class variables
// local variable must always be initialised before use else compilation time error will be thrown when trying to use that un- initialised var
// Memory allocation for local variables happens during method invocation / calling
     */

    public static void main(String[] args) {

        int a = 20; // scope of " a" is throughout the method from the point of declaration

        {
            int b = 10; // scope of "b" is within this block only - local variable must always be initialised before use else compilation time error will throw
            System.out.println("Value of a = " + a); // var int a can be accessed within the method O/P a = 20
        }

//        System.out.println("Value of a = " + b); // Out of scope -- >>compile time error
        System.out.println("Value of a = " + a);

    }
}

class localVarEx1 {

    public int max (int x, int y) {

        // x and y are local variables
        if (x > y)
            return x;
        else
            return y;
    }

    public int min (int x, int y) {

        // x and y are local variables
        if (x > y)
            return x;
        else
            return y;
    }

    public int number () {

        int z = 32;
        return z;
//        System.out.println(z); // when return type of method is void
    }

    public static void main(String[] args) {

        // A copy of class i.e object is created in JVM heap memory
        localVarEx1 rfVar = new localVarEx1();
        int result = rfVar.max(10,200); // To reuse method, it is recommended to store method call in a Var for Return type of method
        System.out.println(result);

//        // Option -1
//        rfVar.min(rfVar.max (10,20), 30);
//        System.out.println(rfVar.min(rfVar.max (10,20), 34));
//
//        //Option-2
//        System.out.println(rfVar.min(result, 34));

        int result1 = rfVar.number();
        System.out.println(result1);

    }

    public static class localVar1 {

        public static void main(String[] args) {

            localVar1 rf = new localVar1();

            rf.avg(5,5);

    //        int output = avg(2,2);
    //        System.out.println(output);
        }

         void avg (int a, int b) {

            int sum = (a + b);
            System.out.println(sum);

        }
    }
}
