package ArraysOneDimensional;

//Q.1) Write a Java program to calculate the average value of array elements ?
public class ArrayExcercise3 {

    public static void main(String[] args) {

        int[] numbers = {43,44,24,74};

        // calculate the sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { // Use for loop to loop through all array elements
            sum = sum + numbers[i];
        }

//        for (int s : sum) {
//            sum = sum + numbers[;];
//        }

        //calculate average value
        int average = sum / 4;
        System.out.println("Average value of array elements: "+ average);
    }

}
