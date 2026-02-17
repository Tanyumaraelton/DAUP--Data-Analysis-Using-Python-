import java.io.*;

class FibboSum {
    public static void main(String args[]) {
        int i, sum = 0, a = 0, b = 1, c;

        for (i = 0; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;

            if (c % 2 == 0) {
                sum = sum + c;
            }
        }

        System.out.println("The sum is " + sum);
    }
}
