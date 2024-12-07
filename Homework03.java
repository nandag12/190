//Gopal Nanda
package homework145;
import java.util.Random;
import java.util.Scanner;

public class Homework03 {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random(); do {
	            int playerScore = 0;
	            int computerScore = 0;
	            for (int i = 0; i < 3; i++) {
	                System.out.print("Enter rock, paper, or scissors: ");
	                String playerChoice = scanner.nextLine().toLowerCase();

	                if (!isValidChoice(playerChoice)) {
	                    System.out.println("Invalid input! Computer scores a point.");
	                    computerScore++;continue;  }
  String computerChoice = getComputerChoice(random);
  System.out.println("Computer chose: " + computerChoice);
	   int result = getRoundResult(playerChoice, computerChoice);
	   	if (result == 1) {playerScore++;
  System.out.println("You win this round!");}
	   	else if (result == -1) {computerScore++;
  System.out.println("Computer wins this round!");}
		else {
  System.out.println("It's a draw!");}
  System.out.println("Score: You " + playerScore + " - Computer " + computerScore); }

	            // Determines overall winner
	            if (playerScore > computerScore) {
	                System.out.println("You Win!");
	            } else if (computerScore > playerScore) {
	                System.out.println("You Lost Please Try Again:(");
	            } else {
	                System.out.println("The game is a tie!");}
  System.out.print("Do you want to play again? (yes/no): ");} while (scanner.nextLine().equalsIgnoreCase("yes"));
  System.out.println("Thanks for playing!"); scanner.close();}
 private static boolean isValidChoice(String choice) {
	        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");}
 private static String getComputerChoice(Random random) {
	        String[] choices = {"rock", "paper", "scissors"};
	        return choices[random.nextInt(3)];}
 private static int getRoundResult(String player, String computer) {
	        if (player.equals(computer)) return 0; 	        
	        if ((player.equals("rock") && computer.equals("scissors")) ||
	           (player.equals("paper") && computer.equals("rock")) ||
	           (player.equals("scissors") && computer.equals("paper"))) {return 1; } return -1;}}
