import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(alldg(n, 0));
    }

    public static String alldg(String n, int index) {
        if (index == n.length()) {
            return "Yes";
        }
        if (!Character.isDigit(n.charAt(index))) {
            return "No";
        }
        return alldg(n, index + 1);
    }
}