package Array.ArraysMultiDimensional;
/* || Multi Dimensional Arrays ||
-


 */
public class Arrays {

    public static void main(String[] args) {
        // 2 Dimensional array
        int[][] studentsMarks = new int[3][5];

        // Student - 1
        studentsMarks[0][0] = 90;
        studentsMarks[0][1] = 56;
        studentsMarks[0][2] = 87;
        studentsMarks[0][3] = 65;
        studentsMarks[0][4] = 54;

        // Student - 2
        studentsMarks[1][0] = 93;
        studentsMarks[1][1] = 45;
        studentsMarks[1][2] = 87;
        studentsMarks[1][3] = 65;
        studentsMarks[1][4] = 54;

        // Student - 3
        studentsMarks[2][0] = 56;
        studentsMarks[2][1] = 89;
        studentsMarks[2][2] = 78;
        studentsMarks[2][3] = 65;
        studentsMarks[2][4] = 54;


        // Run outer for loop to through parent array
        for (int i = 0;  i < studentsMarks.length; i++) {
            // Run inner for loop to through child arrays
            for (int j = 0; j < studentsMarks[i].length; j++) {
                System.out.print(studentsMarks[i][j] + " ");

            }
            System.out.println();

        }

        // Or enhanced for loop can be used
        // Run outer for loop to through parent array
//        for (int[] studentsMark : studentsMarks) {
//            // Run inner for loop to through child arrays
//            for (int t : studentsMark) {
//                System.out.print(t + " ");
//            }
//            System.out.println();
//        }

    }
}
