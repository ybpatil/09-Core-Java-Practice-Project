package com.methods;

class Test {

    static int count = 0;

    Test () {
        count++;
        System.out.println("Count :" + count);
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();

    }
}

class Test1 {

    int count = 0;

    Test1 () {
        count++;
        System.out.println("Count :" + count);
    }

    public static void main(String[] args) {

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        Test1 t3 = new Test1();
        Test1 t4 = new Test1();
        Test1 t5 = new Test1();

    }
}
