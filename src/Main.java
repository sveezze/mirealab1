import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(5);
        int[] array2 = generateRandomArray(5);

        System.out.println("Original Arrays:");
        printArray(array1);
        printArray(array2);

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Sorted Arrays:");
        printArray(array1);
        printArray(array2);
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Adjust the range as needed
        }

        return array;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}