import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  static int calculateDiv(int a, int b) {
    return ((a * b) - 3);
  }
  public static void main(String[] args) {
    int o = calculateDiv(10, 2);
    System.out.println(o);

    byte b = 115;
    byte b1 = 10;
    short s = 31000;
    short s1 = 1000;
    int x = 50000;
    int y = 40000;

    System.out.println(b + b1);
    System.out.println(b - b1);
    System.out.println(b * b1);
    System.out.println(b / b1);

    System.out.println(s + s1);
    System.out.println(s - s1);
    System.out.println(s * s1);
    System.out.println(s / s1);

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number");
    int u = scanner.nextInt();
    System.out.println("Enter second number");
    int v = scanner.nextInt();
    System.out.println("Get result");

    int l = calculateDiv(u, v);
    System.out.println(o);

  }
}

