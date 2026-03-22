import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int n, int d) {
        if (n < 2) return false;
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrime(n, d + 1);
    }
}