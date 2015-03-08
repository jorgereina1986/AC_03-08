package nyc.c4q.jorgereina1986;

/**
 * Created by DjLagarto on 3/8/15.
 */
public class counter {
    public static void main(String[] args) {
        int counter = 100;
        while (counter >= 1) {
            System.out.println(counter);
            if (counter > 10)
            counter = counter - 5;

            else
            counter = counter - 1;
        }
        System.out.println("blastoff!");
    }
}
