import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        
        while (guess != number) {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
            else
                System.out.println("Correct!");
        }
        sc.close();
    }
}