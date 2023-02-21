import java.util.*;

// public class LCM {
//   private static long lcm_naive(int a, int b) {
//     for (long l = 1; l <= (long) a * b; ++l)
//       if (l % a == 0 && l % b == 0)
//         return l;

//     return (long) a * b;
//   }

public class LCM {
  private static long lcm_naive(long a, long b) {
    return a * b / gcd(a, b);
  }

  private static long gcd(long a, long b) {
    long divisor = a >= b ? a : b;
    long dividend = a < b ? a : b;
    while (dividend != 0) {
      long remainder = divisor % dividend;
      divisor = dividend;
      dividend = remainder;
    }
    return divisor;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm_naive(a, b));
  }
}
