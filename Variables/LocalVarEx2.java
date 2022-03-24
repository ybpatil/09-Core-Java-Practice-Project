package com.Variables;

public class LocalVarEx2 {
    // here var a ans b are local variables
    void method1 (int a, int b) {

        int i; // If we only declare local var but doesn't use, this won't cause any error
//        System.out.println(i); // Local variable in this case " i " must be initialised before using it else error will be thrown
    }

    public static void main(String[] args) {
        // Create an object
        LocalVarEx2 rf = new LocalVarEx2();

        // Access an object with Object (Ref.Var) followed by .(dot) operator & method signature
        rf.method1(23,24);

    }
}
