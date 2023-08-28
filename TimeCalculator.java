//Write a program that prompts for and reads integer values for 
//speed and distance traveled, then prints the time required for the 
//trip as a floating point result.

import java.util.Scanner; 

public class TimeCalculator{
    public static void main(String[] args){
       int speed, distance;
       double time; 

       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the speed and distance: ");
       speed=scan.nextInt();
       distance=scan.nextInt();

       time= (double) distance / speed;
       System.out.println("The time required for the trip : " + time);



    }
   


}