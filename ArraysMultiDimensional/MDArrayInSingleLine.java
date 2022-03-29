package Array.ArraysMultiDimensional;
/*
- We can also declare , create and initialize an array in single line
- Syntax:
        data types [] ArrayName = {"", "", "", };
      Ex. int[] marks = {"45","76","88"};


 */

public class MDArrayInSingleLine {

    public static void main(String[] args) {

        int studentsMarks [][] = {{90, 87, 65},{90,77,65,65},{76,98,67,78}};
        
//        for (int[] m1 : studentsMarks) {
//            for (int[] n: studentsMarks) {
//                System.out.print(studentsMarks);
//            }
//            System.out.println();
//        }

        // Accessing 2D Array in reverse direction using for loop
        for (int i = 0; i < studentsMarks.length; i++) {
            for (int j = 0; j < studentsMarks[i].length; j++) {
                System.out.print(studentsMarks[i][j] + " ");
            }
            System.out.println();
        }

//        // Using Enhanced for loop
//        for (int[] studentsMark : studentsMarks) {
//            for (int i : studentsMark) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }


    }
}
