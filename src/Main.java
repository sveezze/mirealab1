import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[5];
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        float middle = sum / array.length;
        System.out.println(Arrays.toString(array));
        System.out.println(middle);
        System.out.println(sum);
    }
}