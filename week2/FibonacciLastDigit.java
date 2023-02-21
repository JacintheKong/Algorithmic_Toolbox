import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class FibonacciLastDigit {
    public static Integer INF = Integer.MAX_VALUE;

    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;
        // int previous = 0;
        // int current = 1;

        // for (int i = 0; i < n - 1; ++i) {
        // int tmp_previous = previous;
        // previous = current;
        // current = tmp_previous + current;
        // }
        ArrayList<Integer> dp = new ArrayList<Integer>(Collections.nCopies(n + 1, INF));
        dp.set(0, 0);
        dp.set(1, 1);
        for (int i = 2; i <= n; ++i)
            dp.set(i, (dp.get(i - 2) + dp.get(i - 1)) % 10);
        return dp.get(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}
