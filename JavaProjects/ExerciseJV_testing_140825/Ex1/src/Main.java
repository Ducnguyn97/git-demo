import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of months:");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println(NextDayCalculator.NextDay(day,month));
    }
}
