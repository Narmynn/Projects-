//Assume the int variable value has been initialized to a positive integer. 
//Write a while loop that prints all of the positive divisors of value. For 
//example, if value is 28, it prints divisors of 28: 1 2 4 7 14 28

import java.util.Scanner;

class Divisors{
    public static void main(String[] args)
    {
        int count=1;
        int value;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        value=scan.nextInt();

        while(count<=value)
        {
            if((value%count)==0)
            System.out.println(count);
            count++;
            
        }

    }
}