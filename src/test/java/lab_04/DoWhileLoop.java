package lab_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomeNumber = new SecureRandom().nextInt(11);
        System.out.println("Random number is: " + randomeNumber);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a number: ");
            int userNumber = scanner.nextInt();
            if(randomeNumber==userNumber) {
                System.out.println("Congratulations");
                break;
            }
            guessingTime++;
        }while (guessingTime < 3);
        System.out.println("See you later");
    }
}
