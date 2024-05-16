import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Cycle length:");
        int cycleLength = scanner.nextInt();

        System.out.println("Generate flow report for how many months:");
        int months = scanner.nextInt();

        System.out.println("Date of last flow (in the format of DD/MM/YYYY):");
        scanner.nextLine();
        String inputDate = scanner.nextLine();

        