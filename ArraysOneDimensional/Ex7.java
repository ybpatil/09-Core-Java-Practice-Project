package ArraysOneDimensional;

public class Ex7 {

    public static void main(String[] args) {

        int [] numbers  = new int[5];

        numbers [0] = 22;
        numbers [1] = 25;
        numbers [2] = 24;
        numbers [3] = 26;
        numbers [4] = 27;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of an array element is: " + sum);

        double avg = sum / 5; // avg of all array element
        System.out.println(avg);

    }
}
