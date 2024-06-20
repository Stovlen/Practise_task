import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення координат лівого нижнього кута квадрата
        System.out.print("Введіть координату x лівого нижнього кута квадрата: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введіть координату y лівого нижнього кута квадрата: ");
        double y1 = scanner.nextDouble();

        // Введення довжини сторони квадрата
        System.out.print("Введіть довжину сторони квадрата: ");
        double sideLength = scanner.nextDouble();

        // Введення координат точки
        System.out.print("Введіть координату x точки: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть координату y точки: ");
        double y = scanner.nextDouble();

        // Закриваємо сканер
        scanner.close();

        // Обчислення координат правого верхнього кута квадрата
        double x2 = x1 + sideLength;
        double y2 = y1 + sideLength;

        // Перевірка, чи знаходиться точка всередині квадрата
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Точка знаходиться всередині квадрата.");
        } else {
            System.out.println("Точка знаходиться поза квадратом.");
        }
    }
}
