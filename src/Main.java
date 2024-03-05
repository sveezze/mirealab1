import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // можно заменить на ввод с клавиатуры
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}