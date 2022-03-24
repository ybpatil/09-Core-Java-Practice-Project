package com.LoopingStatements;

class ForLoop {

/* For Loop :
 --> The for loop in java is used to iterate and evaluate a code multiple times.
 --> When the number of iterations is known by the user, it is recommended to use the for loop.
Syntax:
for (initialization; condition; increment/decrement)
{
statement;
}
     */

    public static void main(String[] args) {

        for (int i = 0 ; i <= 8 ;i++) {

            if (i  == 4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("How are you doing ?");

    }
}

class WhileLoop {

    public static void main(String[] args) {

        int i = 1;
        while ( i <= 8){

            if (i == 4) {
                continue;
            }
            System.out.println(i);
            i++;



        }
    }
}
