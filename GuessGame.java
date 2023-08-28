import java.util.*;
public class GuessGame{
    public static void main(String[] args)
    {
        final int MAX=10;
        int answer, guess; 

        Scanner scan= new Scanner(System.in);
        Random generator= new Random();

        answer= generator.nextInt(MAX)+1;
        System.out.print("I'm thinking of a number between 1-10. Guess what it is: ");
        guess=scan.nextInt();


        if(guess==answer)
          System.out.println("You got it right. ");
        else
        {
            System.out.println("That is not correct. ");
            System.out.println("The answer was "+ answer);

        }
    }
}