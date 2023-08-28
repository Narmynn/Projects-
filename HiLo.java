import java.util.Random;
import java.util.Scanner;
class HiLo{
    public static void main(String [] args){

        int num1;
        int guess=-1;

        Random generator= new Random();
        num1=generator.nextInt(100)+1;
        System.out.println(num1);

        
        Scanner scan= new Scanner(System.in);
        guess=scan.nextInt();
        
        while(guess!=num1){
            System.out.println("Guess the number: ");
            guess=scan.nextInt();

        
        if(num1==guess){
            System.out.println("You are correct");
        } else if(num1<guess){
            System.out.println("Your guess is too high");
        }else{
            System.out.println("Your guess is too low");
        }
    }




    }
}