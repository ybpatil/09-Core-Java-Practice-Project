package com.Variables;

// Memory allocation for Instance variable -->
public class MemoryAllocation {
    // Instance Variable
    int x = 10;

    public static void main(String[] args) {

    // For instance variable memory will be allocated when object is created
    // Step -1 >> create an object of type class MemoryAllocation
     MemoryAllocation fp = new MemoryAllocation();

     // accessing the variable with Obj.RefVar followed by .(dot) varName
     System.out.println(fp.x);

    }
}
