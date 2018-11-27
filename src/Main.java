import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pancake[] pancakes = new Pancake[999];

        Random rand = new Random();

        for (int i = 0; i < 999; i++) {
            pancakes[i] = new Pancake();
            pancakes[i].setTemperature(rand.nextInt(200));
            System.out.println(pancakes[i].getTemperature());
        }

    }


}
