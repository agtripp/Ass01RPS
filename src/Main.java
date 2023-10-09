import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p1Guess = "";
        String p2Guess = "";
        String Again = "";
        boolean done = false;
        boolean Done = false;
        do {
            do {
                System.out.print("Player 1, choose your move [RPS] : ");
                p1Guess = in.nextLine();
                if (p1Guess.equalsIgnoreCase("R") || p1Guess.equalsIgnoreCase("P") || p1Guess.equalsIgnoreCase("S"))  {
                    done = true;
                } else {
                    System.out.println("You entered " + p1Guess + " not a valid move.");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Player 2, choose your move [RPS] : ");
                p2Guess = in.nextLine();
                if (p2Guess.equalsIgnoreCase("R") || p2Guess.equalsIgnoreCase("P") || p2Guess.equalsIgnoreCase("S"))  {
                    done = true;
                } else {
                    System.out.println("You entered " + p2Guess + " not a valid move.");
                }
            } while (!done);
            if (p1Guess.equalsIgnoreCase("R")) {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Rock ties with rock, it's a tie!");
                }
                if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Paper beats rock, player 2 wins!");
                }
                else {
                    System.out.println("Rock beats Scissors! player 1 wins!");
                }
            }
            else if (p1Guess.equalsIgnoreCase("P")) {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats Rock, player 1 wins");
                }
                else if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Paper ties with paper, it's a tie!");
                }
                else {
                    System.out.println("Scissors beats paper, player 2 wins!");
                }
            }
            else {
                if (p2Guess.equalsIgnoreCase("R")) {
                    System.out.println("Rock beats scissors, player 2 wins!");
                }
                else if (p2Guess.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats paper! player 1 wins!");
                }
                else {
                    System.out.println("Scissors ties scissors! it's a tie!");
                }
            }
            done = false;
            do {
                System.out.print("Play again? [Y/N] :");
                Again = in.nextLine();
                if (Again.equalsIgnoreCase("Y"))  {
                    done = true;
                }
                else if (Again.equalsIgnoreCase("N"))  {
                    done = true;
                    Done = true;
                }
                else {
                    System.out.println("You entered " + Again + " which is not a valid choice.");
                }
            } while (!done);
        } while (!Done);
    }
}