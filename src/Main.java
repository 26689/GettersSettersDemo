import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Car carretje = new Car("black");

        Scanner s = new Scanner(System.in);
        String input = s.next();


       carretje.setColor(input);
       System.out.println(carretje.getColor());

    }
}
