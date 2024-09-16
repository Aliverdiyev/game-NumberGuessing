import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = rand.nextInt(1, 101);
//        System.out.println("Random number: " + randomNumber);

        int trieCount = 0;
        while (true) {
            System.out.println("Enter your guess (1-100): ");
            int guessNumber = input.nextInt();
            trieCount++;
            if (guessNumber == randomNumber) {
                System.out.println("Your guess is correct!");
                System.out.println("You took " + trieCount + " tries.");
                break;
            } else if (guessNumber > randomNumber) {
                System.out.println("Your guess is greater than the given number!");
            } else {
                System.out.println("Your guess is less than the given number!");
            }
        }
        input.close();
    }
}
