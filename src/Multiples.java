/*
    Task 4 of Lab 1
 */
public class Multiples {
    public static void main(String[] args) {
        // prints the number of multiples of 3 and 5 from 1-1000
        // the answer is 467
        int ceil = 1000;
        int count = 0;
        while (ceil > 0) {

            // check if ceil is divisible by 5 or 3
            if (ceil % 5 == 0 || ceil % 3 == 0) {
                count++;
            }
            ceil--;
        }
        System.out.println(count);
    }
}
