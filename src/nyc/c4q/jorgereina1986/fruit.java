package nyc.c4q.jorgereina1986;

import java.util.Scanner;

/**
 * Created by DjLagarto on 3/8/15.
 */
public class fruit {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();
        String color;
        String flavor;
        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else {
            System.out.print("I dont know that fruit");
            return;
        }
        System.out.println("a " + fruit + " i s" + color + " and tastes " + flavor);
    }
}
