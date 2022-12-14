package DynamicProgramming;

import java.util.Scanner;

public class Finonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println(fibonacci(input, new int[input + 1]));
  }

  public static int fibonacci(int n, int qb[]) {
    if (n == 0 || n == 1) {
      return n;
    }
    if (qb[n] != 0) {
      return qb[n];
    }
    System.out.println("Value is --> " + n);
    int fib1 = fibonacci(n - 1, qb);
    int fib2 = fibonacci(n - 2, qb);
    int result = fib1 + fib2;
    System.out.println("Adding --> " + result + " at qb position -->  " + n);
    qb[n] = result;
    return result;
  }
}
