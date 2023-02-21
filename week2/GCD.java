import java.util.*;

public class GCD {
  // private static int gcd_naive(int a, int b) {
  // int current_gcd = 1;
  // for(int d = 2; d <= a && d <= b; ++d) {
  // if (a % d == 0 && b % d == 0) {
  // if (d > current_gcd) {
  // current_gcd = d;
  // }
  // }
  // }
  private static int euclid_gcd(int a, int b) {
    int divisor = a >= b ? a : b;
    int dividend = a < b ? a : b;
    while (dividend != 0) {
      int remainder = divisor % dividend;
      divisor = dividend;
      dividend = remainder;
    }
    return divisor;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(euclid_gcd(a, b));
  }
}
