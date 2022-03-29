package ArraysOneDimensional;

/*
// Array in java is a group of similar type of data referred by common variable name.
// To declare an array, define the variable data type with square brackets. Ex. datatype varName [] or datatype [] varName
// Ex. int marks [] or int [] marks
// Basically arrays in java is an objects

1) Array declaration :- datatype varName []; or datatype [] varName;
2) Array creation :- varName = new dataType [Size]; --> Size of an array must be specified as char, byte, short or int only
- When array is create by using " new " keyword an object will be created in Heap memory of jvm.
- Also, instance variable length = size of created array will be created along with object in heap memory.
- If array size is specified at the time of array creation, there will be an instance var created = size specified which can be used to get array lenght
- If size is not specified i.e for an empty array default values will be printed of specified data type. Ex if int then default value will be zero
- Array indexing in java starts at "Zero" / 0
3) Array Initialization :- Array initialisation means assigning value to array elements first time,
 - Array can be initialised -->> varName [index] = value;
 - For ex. int marks []; // Array declararion
               marks = new int [4] // Array creation
               marks [0] = 98; // Array initialisatio
               marks [1] = 68;
               marks [2] = 78;
               marks [3] = 88;
4) Accessing the Array element:
 - You access an array element by referring to the index number.
 - For ex. System.out.println(int marks [0]); -->> will print value of Zero'th index i.e 98
 - Also, for each loop or enhanced for loop iw used to access the all array elements - Syntax -->> for (datatype declaration : arrayname) {Sysout }
 -  for (int marks1 : marks) --> will print all array elements of specified size


 */

public class Arrays {

    public static void main(String[] args) {

        int[] marks; // Array Declaration

        marks = new int[5]; // Array creation

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("After initialising Array");

        marks [0] = 98; // Array initialisation
        marks [1] = 58;
        marks [2] = 68;
        marks [3] = 78;
        marks [4] = 88;

        // We can also use for loop to loop through an array and also For-each or enhanced for loop can be used !
//        for (int i = 0; i < marks.length ; i++) {
//            System.out.println("Length of an array : " +i);
//        }

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }

        for(int r1 : marks) {
            System.out.println(r1);
        }

    }

}


class Cars {

    public static void main(String[] args) {

        String[] car = {"Volvo","TATA","Mahindra", "MBenz" };
        car [1] = "Thar";

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

//        for (String result : car){
//            System.out.println(result);
//        }


//        System.out.println(car[1]);
//        System.out.println(car[0]);

    }
}