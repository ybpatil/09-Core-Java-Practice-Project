package ArraysOneDimensional;
import java.util.Arrays;

//Q.2) Write a Java program to sort a numeric array and a string array ?
public class ArrayEx4 {

    public static void main(String[] args) {

        int[] numbers = {23,65,98,56,73,-25};
        // Print original int[]
        System.out.println("Original int array: "+Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println("Sorted int array: "+Arrays.toString(numbers));

        Arrays.sort(numbers,0,3);
        System.out.println("Sorted int array: "+Arrays.toString(numbers));



        String[] planets = new String[] {"Earth", "Saturn", "Mars","Pluto" };

        //Print original array
        System.out.println("Original string array: "+Arrays.toString(planets));
        // Sorting String array
        Arrays.sort(planets);
//        Arrays.sort(planets,0,2);
        System.out.println("Sorted string array: "+Arrays.toString(planets));


    }
}
