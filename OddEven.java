//Write a program that determines and prints the number of odd, 
//even, and zero digits in an integer value read from the keyboard.

import java.util.Scanner; 

public class OddEven{
    public static void main(String[] args)
    {
        int value;
        int zeroCount=0,evenCount=0, oddCount=0;

        System.out.println("Enter a number");
        Scanner scan= new Scanner(System.in);
        value=scan.nextInt();

        while (value > 0) {

            if (value%10==0) 
               zeroCount++;
            
            else if (value%2==0)  //As per comment below...
               evenCount++;
            
            else 
               oddCount++;
            
        
            value /= 10;
        }
        System.out.println(); 
        System.out.printf("Even: %d Odd: %d Zero: %d", evenCount, oddCount, zeroCount);
         

    }
}