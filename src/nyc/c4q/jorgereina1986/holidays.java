package nyc.c4q.jorgereina1986;

import java.util.Scanner;

public class holidays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int day;

        System.out.println("Please write month");
        month = scanner.nextLine();

        System.out.println("Please write the day number");
        day = scanner.nextInt();

        if (month.equalsIgnoreCase("January") && (day == 1)) {
            System.out.println("Today is New Years!");
        }
        else if (month.equalsIgnoreCase("May") && (day == 5)) {
            System.out.println("Happy Cinco de Mayo");
        }
        else if (month.equalsIgnoreCase("July") && (day == 4)) {
            System.out.println("Happy Fourth of July");
        }
        else {
            System.out.println("No holiday");
        }
    }
}
