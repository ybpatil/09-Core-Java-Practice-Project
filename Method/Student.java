package com.methods;

public class Student {

    static String name = "Lalita Bajgude";
//    static String companyName = "Infosys";
//    static String designation = "Yogesh Bajgude";
//    static int age = 28;
    int num1;

    void studentDetails (String name, String companyName, String designation, int age) {

        System.out.println(name);
        System.out.println(companyName);
        System.out.println(designation);
        System.out.println(age);

    }



    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentDetails("Yogesh Bajgude","Infy","Ass Con", Integer.parseInt("28"));

        int num =  s1.num1;
        System.out.println(num);

        System.out.println(Student.name);



    }


}
