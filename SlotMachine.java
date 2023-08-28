//Design and implement an application that simulates a simple slot 
//machine in which three numbers between 0 and 9 are randomly 
//selected and printed side by side. Print an appropriate statement 
//if all three of the numbers are the same, or if any two of the numbers are the same. 
//Continue playing until the user chooses to stop

import java.util.*; 

class SlotMachine{
    public static void main(String[] args)
    {
        int num1,num2,num3;
        int play; 

        Random generator= new Random();
        Scanner scan= new Scanner(System.in);
        System.out.println("Type1 to start and 0 to stop playing");
        play=scan.nextInt();

        while(play==1){

        
        num1=generator.nextInt(9);
        num2=generator.nextInt(9);
        num3=generator.nextInt(9);

        System.out.print(num1);
        System.out.print(num2);
        System.out.println(num3);

        if(num1==num2 && num2==num3)
        {
            System.out.println("All three match");
        }

        if(num1==num2|| num1==num3||num2==num3)
        {
            System.out.println("Only two match");
        }
        else
        {
            System.out.println("No match");
        }

        System.out.println("Would you like to play again? Type 1 for yes, and 0 for no.");
        {
            play = scan.nextInt();
        }
    }
    if (play == 0)
    {
        System.out.println("I hope you had fun.");
    }
 }
}
