package loops;

/* Step-1 : --> Find out how many lines / rows are there in given pattern
            --> Run outer loop equals to number of lines /rows in the given pattern

   Step-2 : --> Find out for every row how many columns are there
            --> Run inner loop equals to number of columns in the given pattern
            --> Identify types of element in the column Ex. * ,# and 1,2,3...etc

   Step-3 : --> Identify what do you need to print ?

 */

public class Practice {

    public static void main(String[] args) {
        pattern3(5);

    }

    // Q.1 Right Triangle Pattern
    /*

     *
     * *
     * * *
     * * * *

     Relationship b/w rows and col is  (r = c)

     */
    static void pattern1 (int n) {
        // run the outer loop for number of lines /rows
        for (int row = 1; row <= n; row++) {
            // For every row, run the column --> run the inner loop for number of columns
            for (int col = 1; col <= row; col++) {
                System.out.print("* "); //print star
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    // Q.2
    /*

     * * * *
     * * * *
     * * * *
     * * * *

     */
    static void pattern2 (int n) {
        // run the outer loop for number of lines /rows
        for (int row = 1; row <= n; row++) {
            // run the inner loop for number of columns
            for (int col = 1; col <= n; col++) {
                System.out.print("* "); //print star
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    //Q.3 print pattern for each row if n = 5
    static void pattern3 (int n) {
        // run the outer loop for number of lines /rows
        for (int row = 1; row <= n; row++) {
            // run the inner loop for number of columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" "); //print star
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }



}
