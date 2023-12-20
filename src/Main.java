import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    for(int i = 0; i < 5; i++) array[i] = scanner.nextInt();
    System.out.println(array);
    }
}