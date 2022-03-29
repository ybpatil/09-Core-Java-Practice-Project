package ArraysOneDimensional;

import java.util.Arrays;

public class ArrayEx1 {

    public static void main(String[] args) {

        String [] cars; // Array declaration

        cars = new String [4]; // Array creation

        cars [0] = "Mahindra";
        cars [1] = "Tata";
        cars [2] = "BMW";
        cars [3] = "Suzuki";
//        cars [4] = "Hyundai";
        for (int i = cars.length - 1; i >= 0 ; i--) {
            System.out.println(cars[i]);
        }
        System.out.println(); //print new line

        for (String carType : cars)
        System.out.println( carType );

        System.out.println("Original int array: "+ Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("Sorted int array: "+ Arrays.toString(cars));



    }
}
