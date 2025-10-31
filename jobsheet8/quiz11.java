package jobsheet8;
import java.util.Scanner;
import java.util.Random;
public class quiz11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';
        do {
            int number = rand.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Guess number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number );
                if (answer > number) {
                    System.out.println("the number is greater ");
                } else if ( answer < number){
                    System.out.println("your number is smaller");
                }else {}
            } while (!success);
            System.out.println("Do you want to repeat the game (Y/N)");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
        input.close();
    }
}
