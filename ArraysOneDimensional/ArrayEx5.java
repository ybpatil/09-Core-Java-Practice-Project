package ArraysOneDimensional;

//Q.3) Write a Java program to test if an array contains a specific value ?
public class ArrayEx5 {

    public static boolean contains (int[] arr, int item ) {
        for (int valueAvail : arr){
            if (item == valueAvail){
                return true;
            }
        }
        System.out.print("is item avail?: ");
        return false;
    }

    public static void main(String[] args) {

        int[] myArray = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        System.out.println(contains(myArray,2014));

    }
}
