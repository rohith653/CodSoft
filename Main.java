import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean guessed = false;
        int attemptCount=0;
        while (!guessed) {
            attemptCount++;
            System.out.println("Enter your guessing Number : ");
            int playerNumber = scan.nextInt();
            if (randomNumber == playerNumber) {
                System.out.println("You are guessed Corretly!!!");
                guessed = true;
            } else {
                if (randomNumber > playerNumber) {
                    System.out.println("Try Some Big Value Numbers");
                } else {
                    System.out.println("Try Some Low Value Numbers");
                }
            }
        }
    }
}
