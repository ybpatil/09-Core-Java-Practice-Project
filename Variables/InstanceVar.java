package com.Variables;

class Student {
    /*
    ** Instance Variable:
// Instance variables are associated with instance or object of class
// Scope of instance variable is throuout the class
// Instance variables are declared in a class but outside a methods, constructor or block
// Instance variable will not have a static keyword
// When a space is allocated for an object in the heap a slot for each instance variable value is created
// Instance variable are created when an  object is created with the use of the keyword 'new' and destroyed when the object is destroyed
// Instance variables can be accessed by calling with the -  "objectName.VariableName"
// It is not mandatory to initialise instance variable, JVM will initialize with default values
// Default values : for integers , floats etc = 0, for booleans = false & for object references = null

     */

    public void studentInfo (int id, String name, String branchName) {

        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Branch :" + branchName);
        System.out.println("College Name :" + "AshokIT");
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.studentInfo(122,"Yogesh", "Mech");
        s.studentInfo(123,"Ravi", "Civil");
        s.studentInfo(124,"Rahul", "EEE");
        s.studentInfo(125,"Umesh", "CSE");

    }
}



