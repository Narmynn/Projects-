import java.util.Scanner; 
import java.util.Random; 

class RockPaperScissors{
    public static void main(String[] args)
    {
      final int ROCK= 1; 
      final int PAPER= 2; 
      final int SCISSORS= 3; 

      int userChoice,computerChoice; 

      Scanner scan= new Scanner(System.in);
      Random generator=new Random();

      do {
           System.out.println("1: Rock\n 2:Paper\n 3:Scissors\n -1:Quit");
           userChoice=scan.nextInt();
           computerChoice=generator.nextInt(3)+1;

           if(userChoice==ROCK){
             if(computerChoice==ROCK){
                System.out.println("Rock vs Rock: Tie game");
             }
             else if(computerChoice==PAPER){
                System.out.println("Rock vs Paper: You lose");
             }
             else if(computerChoice==SCISSORS){
                System.out.println("Rock vs Scissors:You win");
             }
            }
        
           else if(userChoice==PAPER){
                if(computerChoice==ROCK){
                System.out.println("Paper vs Rock: You win");
             }
             else if(computerChoice==PAPER){
                System.out.println("Paper vs Paper: Tie game");
             }
             else if(computerChoice==SCISSORS){
                System.out.println("Paper vs Scissors:You lose");
             }
            }

            else if(userChoice==SCISSORS){
                if(computerChoice==ROCK){
                System.out.println("SCISSORS vs Rock: You lose");
             }
             else if(computerChoice==PAPER){
                System.out.println("Scissors vs Paper: You win");
             }
             else if(computerChoice==SCISSORS){
                System.out.println("Sciccors vs Scissors:Tie game");
             }
            }
      }while(userChoice>0);
      System.out.println("Thanks for playing");

    }
}