/*
    Task 5 for Lab 1
 */

public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int num = 100;

        while (num > 0) {
            // reduce by half if even
            if (num % 2 == 0) {
                num /= 2;
            }
            // must be an odd number, reduce by 1
            else {
                num--;
            }

            steps++;

            // System.out.println(steps);
            // System.out.println(num);

        }
        System.out.println(steps);
    }
}
