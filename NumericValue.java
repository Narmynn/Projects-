//Write a program that accepts a user’s name as an input and 
//calculates the numeric value of the name. The numeric value is 
//calculated by summing each letter of the name, assuming a = 1, 
//b = 2, and so on. The case of the letter does not matter, that is, 
//a = 1 and A = 1.

import java.util.Scanner; 

public class NumericValue{
    public static void main(String[] args)
    {
       string name; 
       System.out.println("Name: ");
       Scanner scan= new Scanner(System.in);
       name= scan.nextLine();

       int sum = 0;
       for (char ch : str.toCharArray()) {
        if (ch >= 'A' && ch <= 'Z') {
        sum += 1 + ch - 'A';
    }
}





    }
}