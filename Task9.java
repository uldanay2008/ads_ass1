import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(count(n, 0));
    }

    public static int count(String n, int index) {
        if (index == n.length()) return 0;
        return 1 + count(n, index + 1);
    }
}