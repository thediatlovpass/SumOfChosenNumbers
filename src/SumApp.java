import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        System.out.println("Wybierz ile liczb chcesz wprowadzić: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        do {
            System.out.println("Wprowadź liczbę: ");
            sum = sum + scanner.nextInt();
            scanner.nextLine();
            count--;
        } while (count != 0);
        System.out.println("Wynik: "  + sum);
    }
}
