package Array.ArraysMultiDimensional;

public class JaggedArray {

    public static void main(String[] args) {
        // 2 Dimensional array
        int[][] studentsMarks = new int[3][];
        // Jagged Arrays - Arrays of Arrays with un even size --> we can save memory with JaggedArray
        //Size - 3
        studentsMarks[0] = new int[3];
        //Size - 4
        studentsMarks[1] = new int[4];
        //Size - 5
        studentsMarks[2] = new int[5];

        // Student - 1
        studentsMarks[0][0] = 90;
        studentsMarks[0][1] = 56;
        studentsMarks[0][2] = 87;

        // Student - 2
        studentsMarks[1][0] = 93;
        studentsMarks[1][1] = 45;
        studentsMarks[1][2] = 87;
        studentsMarks[1][3] = 65;


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
    }
}
