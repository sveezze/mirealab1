import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int number = 5; // можно изменить на любое число
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + ": " + factorial);
    }

    private static long calculateFactorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}