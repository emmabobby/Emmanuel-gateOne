import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycle {


 public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your last menstrual cycle date (dd-MM-yyyy): ");
        String lastCycleDateStr = userInput.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate lastCycleDate = LocalDate.parse(lastCycleDateStr, formatter);

        System.out.print("Enter your cycle length: ");
        String mensCycleLength = userInput.nextLine();
        int cycleLength = Integer.parseInt(mensCycleLength);

        LocalDate nextFlow = calculateNextFlowDate(lastCycleDate, cycleLength);

        LocalDate safePeriodStart = nextFlow.minusDays(9);
        LocalDate safePeriodEnd = nextFlow.minusDays(1);

        LocalDate fertilityCycleStart = nextFlow.minusDays(18);
        LocalDate fertilityCycleEnd = nextFlow.minusDays(10);

		System.out.printf("Your possible next flow date is %s%nYour possible safe cycle is %s to %s%nYour possible fertility cycle %s to %s  ",nextFlow.format(formatter),safePeriodStart.format(formatter),safePeriodEnd.format(formatter),fertilityCycleStart.format(formatter),fertilityCycleEnd.format(formatter));

   
    }

    public static LocalDate calculateNextFlowDate(LocalDate lastCycleDate, int cycleDuration) {
        return lastCycleDate.plusDays(cycleDuration);

}

}