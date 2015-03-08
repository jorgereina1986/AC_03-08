package nyc.c4q.jorgereina1986;

import java.util.Scanner;

/**
 * Created by DjLagarto on 3/8/15.
 */
public class whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x =10;
        while (x < 100) {
            System.out.println("the number is " + x);
            System.out.println("whats another number? ");
            x= scanner.nextInt();
        }
    }
}