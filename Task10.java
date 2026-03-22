import java.util.Scanner; // Обязательно для ввода [cite: 67]

public class Task10 {
    // 1. Точка входа (Запуск)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаем сканер [cite: 70]

        if (sc.hasNextInt()) {
            int x = sc.nextInt(); // Читаем первое число [cite: 71]
            int y = sc.nextInt(); // Читаем второе число [cite: 75]
            System.out.println(gcd(x, y)); // Вызываем функцию и печатаем результат [cite: 73]
        }
    }

    // 2. Сама рекурсивная функция
    public static int gcd(int x, int y) {
        if (y == 0) return x; // Базовый случай [cite: 79]
        return gcd(y, x % y); // Рекурсивный шаг [cite: 80]
    }
}