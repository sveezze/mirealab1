import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество аргументов командной строки: ");
        int numArgs = scanner.nextInt();

        String[] commandLineArgs = new String[numArgs];

        System.out.println("Введите аргументы командной строки:");

        for (int i = 0; i < numArgs; i++) {
            System.out.print("Аргумент " + (i + 1) + ": ");
            commandLineArgs[i] = scanner.next();
        }

        System.out.println("Введенные аргументы командной строки:");

        for (String arg : commandLineArgs) {
            System.out.println(arg);
        }
    }
}