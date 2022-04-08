package com.methods;

class Main {
    String fName = "Krishna";

// Static method and Non returning types of method
    static void myMethod (String fName) {

        System.out.println(fName + " Bajgude");
    }

    static String myMethod1 (String fName, int age ) {
//        System.out.println(fName + " is " + age + " years old");
        return fName + "is " + age + " Years old";
    }

    public static void main(String[] args) {
//        myMethod("Yogesh");
//        myMethod("Lalita");
//        myMethod("Krishna");
//        myMethod("Revati");

//        myMethod1("Yogesh",28);
//        myMethod1("Lalita",21);
//        myMethod1("Krishna",30);

//        Main obj1 = new Main();
//        String details = obj1.myMethod1(" Yogesh ",28);
//        System.out.println(details);
//
//        String details1 = obj1.myMethod1(" Yogesh ",29);
//        System.out.println(details1);

//        Main s = new Main();
//        String name = s.fName = "Lalita";
//        System.out.println(name);
//
//        Main t = new Main();
//        t.fName = "Bali"; // changing the attribute (Instance variable) value
//        String name1 = t.fName;
//        System.out.println(name1);



        Main z = new Main();
        z.fName = "Hari"; // changing the value of fName using object.fName
        System.out.println("fName : " +z.fName);
        z.fName = "Ram";
        System.out.println("fName : " +z.fName);



    }


}
