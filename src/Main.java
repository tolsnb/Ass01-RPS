import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userChoice = "";
        String computerChoice = "";
        String cont = "";
        double RNG = 0;
        boolean done = false;
        do
        {
            System.out.println("Rock [R/r], Paper [P/p], or Scissors [S/s]? ");
            if(in.hasNext())
            {
                userChoice = in.nextLine();
                in.nextLine();
            }
            if(userChoice.equalsIgnoreCase("R"))
            {
                userChoice = "Rock";
                System.out.println("You chose rock! Simulating computer choice...");
                if(RNG == 1){
                    computerChoice = "R";
                }
                else if(RNG == 2){
                    computerChoice = "S";
                }
                else{
                    computerChoice = "P";
                }
            }
            else if (userChoice.equalsIgnoreCase("P"))
            {
                userChoice = "Paper";
                System.out.println("You chose paper! Simulating computer choice...");
                if(RNG == 1){
                    computerChoice = "R";
                }
                else if(RNG == 2){
                    computerChoice = "S";
                }
                else{
                    computerChoice = "P";
                }
            }
            else if (userChoice.equalsIgnoreCase("S"))
            {
                userChoice = "Scissors";
                System.out.println("You chose scissors! Simulating computer choice...");
                if(RNG == 1){
                    computerChoice = "Rock";
                }
                else if(RNG == 2){
                    computerChoice = "Scissors";
                }
                else{
                    computerChoice = "Paper";
                }
            }
            else
            {
                System.out.println("Enter a valid input (Rock/Paper/Scissors)!");
            }
            boolean finished = false;
            while (!finished)
            {
                RNG = Math.floor(Math.random() *(3 - 1 + 1) + 1);
                if(RNG == 1){
                    computerChoice = "Rock";
                }
                else if(RNG == 2){
                    computerChoice = "Scissors";
                }
                else{
                    computerChoice = "Paper";
                }
                if(userChoice.equalsIgnoreCase(computerChoice))
                {
                    System.out.println(userChoice + " vs " + computerChoice + "! It's a tie!");
                }
                else if(userChoice.equals("Rock"))
                {
                    if(computerChoice.equals("Scissors"))
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + userChoice + " wins!");
                    }
                    else
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + computerChoice + " wins!");
                    }
                }
                else if(userChoice.equals("Paper"))
                {
                    if(computerChoice.equals("Rock"))
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + userChoice + " wins!");
                    }
                    else
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + computerChoice + " wins!");
                    }
                }
                else if(userChoice.equals("Scissors"))
                {
                    if(computerChoice.equals("Paper"))
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + userChoice + " wins!");
                    }
                    else
                    {
                        System.out.println(userChoice + " vs " + computerChoice + "! " + computerChoice + " wins!");
                    }
                }
                System.out.println("Do you want to play again? [Y/N]");

                if (in.hasNext())
                {
                    cont = in.nextLine();
                    in.nextLine();
                }
                if(cont.equalsIgnoreCase("Y"))
                {
                    System.out.println("You chose to continue. Good luck next game!");
                    finished = true;
                    done = false;
                }
                else
                {
                    System.out.println("Thanks for playing!");
                    finished = true;
                    done = true;
                }
            }
        }while(!done);
    }
}