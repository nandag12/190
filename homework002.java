

//Gopal Nanda

import java.util.Scanner;

public class main.java {
    public static void main(String[] args) {
        startGame();}

    public static void startGame() {
        System.out.println("A rat is stuck inside a maze.Help him escape!");
        decisionChain(1);}
    //player is told that a rat needs to escape (intro)

    public static void decisionChain(int step) {
        Scanner scanner = new Scanner(System.in);
        switch (step) {
            case 1:
                System.out.print("The rat can go left or right. Which way should he go? ");
                scanner.nextLine();
                decisionChain(2);
                break;
            case 2:
                System.out.print("The rat sees a piece of cheese or a hole. What should it investigate? (cheese/hole) ");
                scanner.nextLine();
                decisionChain(3);
                break;
            case 3:
                System.out.print("The rat encounters a cat or a door. What should it do? (cat/door) ");
                scanner.nextLine();
                decisionChain(4);
                break;
            case 4:
                System.out.print("The rat finds a small tunnel or can climb over a wall. What should it do? (tunnel/wall) ");
                scanner.nextLine();
                decisionChain(5);
                break;
            case 5:
                System.out.print("The rat hears a noise. Should it investigate the noise or ignore it? (investigate/ignore) ");
                scanner.nextLine();
                decisionChain(6);
                break;
            case 6:
                System.out.print("The rat can gather food or find a friend. What should it do? (food/friend) ");
                scanner.nextLine();
                decisionChain(7);
                break;
            case 7:
                System.out.print("The rat can rest for a while or keep moving. What does it choose? (rest/move) ");
                scanner.nextLine();
                decisionChain(8);
                break;
            case 8:
                System.out.print("The rat finds two paths. Should it go through the dark path or the bright path? (dark/bright) ");
                scanner.nextLine();
                decisionChain(9);
                break;
            case 9:
                System.out.print("The rat finally sees an exit or a trap. What does it choose? (exit/trap) ");
                String finalChoice = scanner.nextLine().trim().toLowerCase();
                finalEnding(finalChoice);
                break;
            default:
                break;}}
    //there are 9 total decisions to be made but only the last one counts
    public static void finalEnding(String choice) {
        if (choice.equals("exit")) {
            System.out.println("Ending: The rat got tricked back into the maze, Try Again!:(");
        } else if (choice.equals("trap")) {
            System.out.println("Ending: The rat falls into the trap but cleverly escapes!:)");
        } else {
            System.out.println("Ending: The rat is confused but finds a way back to safety!");
            //this is end result of game
            //1 choice lead to sucess and the other leads back to the trap
            //last else line allows players to accidently enter a word other than exit/trap and have the game still function
        }}}


}
