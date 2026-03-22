import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            double sum = findSum(arr, n);
            System.out.println(sum / n);
        }
    }

    public static double findSum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + findSum(arr, n - 1);
    }
}