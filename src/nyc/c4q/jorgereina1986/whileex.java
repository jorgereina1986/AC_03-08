package nyc.c4q.jorgereina1986;

import java.util.Scanner;

public class whileex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 100;
        int y = 0;

        while (x >= 0) {
            System.out.println("You have " + x + " M&Ms left");

            System.out.println("How many do you want to eat? ");
            y = scanner.nextInt();

            while (y > x) {
                System.out.println("You don't have that many M&Ms left. Try again.");
                y = 0;
            }

            x = x - y;
        }
    }
}