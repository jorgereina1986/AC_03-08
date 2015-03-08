package nyc.c4q.jorgereina1986;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by DjLagarto on 3/8/15.
 */
public class guessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(10) + 1;

        while (true) {
            System.out.println("choose a number");
            int guess = scanner.nextInt();

            if (guess > number)
                System.out.println("too high");
            else if (guess < number)
                System.out.println("too low");
            else {
                System.out.println("CORRECT!");
                break;
            }

        }


    }
}
