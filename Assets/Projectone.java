import java.util.Scanner;
import java.lang.Math;
public class Projectone {
    public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);

        String coinFlipResult;
        String spinnerResult;

        //calculates the possible outcomes with numbers
        int dice = (int) (Math.random() * 6 + 1);
        int coinFlip = (int) (Math.random() * 2);
        int spinner = (int) (Math.random() * 4);

        //converts the numbers into words
        if (coinFlip == 0){
            coinFlipResult = ("heads");
        }
        else{
            coinFlipResult = ("tails");
        }

        if (spinner == 0){
            spinnerResult = ("red");
        }
        else if (spinner == 1){
            spinnerResult = ("green");
        }
        else if (spinner == 2){
            spinnerResult = ("blue");
        }
        else{
            spinnerResult = ("yellow");
        }

        //collects the user's guesses
        System.out.println("WELCOME TO THE GAME OF CHANCE\nLet's see if you won...\n");
        System.out.print("What is your guess on the dice roll, 1-6?: ");
        int diceGuess = keyboard.nextInt();

        //all while loops check to make sure the user's guess is a valid one
        while (diceGuess < 1 || diceGuess > 6){
            System.out.print("Invalid guess. Please specifically input one of the numbers listed.\nWhat is your guess on the dice roll, 1-6?: ");
            diceGuess = keyboard.nextInt();
        }

        keyboard.nextLine();

        System.out.print("What is your guess on the coin flip, heads or tails?: ");
        String coinFlipGuess = keyboard.nextLine();

        while (!(coinFlipGuess.equals("heads")) && !(coinFlipGuess.equals("tails"))){
            System.out.print("Invalid guess. Please specifically input one of the sides of the coin listed.\nWhat is your guess on the coin flip, heads or tails?: ");
            coinFlipGuess = keyboard.nextLine();
        }

        System.out.print("What is your guess on the spinner, red, green, blue, or yellow?: ");
        String spinnerGuess = keyboard.nextLine();

        while(!(spinnerGuess.equals("red")) && !(spinnerGuess.equals("green")) && !(spinnerGuess.equals("blue")) && !(spinnerGuess.equals("yellow"))){
            System.out.print("Invalid guess. Please specifically input one of the colors listed.\nWhat is your guess on the spinner, red, green, blue, or yellow?: ");
            spinnerGuess = keyboard.nextLine();
        }

        //tells the user what the outcomes were
        System.out.println("\nYou rolled a " + dice);
        System.out.println("You flipped " + coinFlipResult);
        System.out.println("You spun " + spinnerResult);

        //tells the user which games they got correct, with checks for proper punctuation in the results.
        System.out.print("\nYou correctly guessed ");
        if (diceGuess == dice){
            System.out.print("the dice roll");
            if (!(coinFlipGuess.equals(coinFlipResult)) && !(spinnerGuess.equals(spinnerResult))){
                System.out.print(".");
            }
            else if (coinFlipGuess.equals(coinFlipResult) && (spinnerGuess.equals(spinnerResult))){
                System.out.print(", ");
            }
        }
        if (coinFlipGuess.equals(coinFlipResult)){
            if (diceGuess == dice && !(spinnerGuess.equals(spinnerResult))){
                System.out.print(" and ");
            }
            System.out.print("the coin flip");
            if (!(spinnerGuess.equals(spinnerResult))){
                System.out.print(".");
            }
            else if (diceGuess == dice){
                System.out.print(",");
            }
        }
        if (spinnerGuess.equals(spinnerResult)){
            if (coinFlipGuess.equals(coinFlipResult) || diceGuess == dice){
                System.out.print(" and ");
            }
            System.out.print("the spinner.");
        }
        if (diceGuess != dice && !(coinFlipGuess.equals(coinFlipResult)) && !(spinnerGuess.equals(spinnerResult))){
            System.out.print("nothing. Sorry!");
        }
    }
}