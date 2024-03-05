import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.4f%n", 1.0 / i);
        }
    }
}