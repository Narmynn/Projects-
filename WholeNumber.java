//Write a program that reads a floating point value (double) and 
//prints the closest whole numbers less than and greater than that 
//value. For example, if the number is 28.466, the program would 
//print 28 and 29.

import java.util.Scanner;

public class WholeNumber{
    public static void main(String[] args)
    {
       double num1;
       Scanner scan= new Scanner(System.in);
       System.out.println("Number: ");
       num1=scan.nextDouble();
       Math.ceil(num1);
       Math.floor(num1);

       System.out.println(Math.ceil(num1));
       System.out.println(Math.floor(num1));




        
    }
}
