//Write a program that generates a random password that meets 
//certain criteria. The password should start with 7 or 8 or 9, and 
//the next five digits can be any digit from 0 to 9. This should be 
//followed by a dash (-) and then three random uppercase letters. 
//Hint: The integers from 65 to 90 represent the uppercase letters 
//from A to Z. You can cast an integer to a char type like this: 
//(char)65 is 'A' and (char)66 is 'B'.

import java.util.Random;

public class PasswordGenerator{
    public static void main(String[] args)
    {
        Random generator= new Random();
        int num1, num2; 
        num1=generator.nextInt(3)+7;
        System.out.print(num1);

        num2=generator.nextInt(9)*1000+generator.nextInt(1000);
        System.out.println(num2+"-");

       
         
        int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));

        System.out.println(num1+ num2+"-" + (char)(letter1) + (char)(letter2) + 
			(char)(letter3));
   
    }
}