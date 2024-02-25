
import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
	
	public  static void main (String[] args){

	   Scanner sc = new Scanner(System.in);
	   Random ran = new Random();

	   int numberToGuess = ran.nextInt(20);
	   int numberOfTries = 0;
	   int guess;
	   boolean win = false;

	   while(win == false){

		System.out.println("Guess a number between 1 to 20");
		guess = sc.nextInt();
		numberOfTries++;

		if(guess == numberToGuess){

			win = true;
		}
		else if (guess < numberToGuess){
			
			System.out.println("Your guess is too low, try another number.");
		}
		else if (guess > numberToGuess){

			System.out.println("Your guess is too high, try another number.");
		}

	}

	System.out.println("You win!. Thankyou!");
	System.out.println("The number was" + " " + numberToGuess);
	System.out.println("It took you" + " " + numberOfTries + " " + "tries");

	sc.close();
	}
}

	  
	  