import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber = 24;
        System.out.println("What's my secret number?");
        Scanner reader = new Scanner(System.in);
        int guess = Integer.parseInt(reader.nextLine());

        if (guess == secretNumber){
            System.out.println("You guessed right!");
        } else if (guess > secretNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }






    }


}

