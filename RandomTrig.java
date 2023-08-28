//Write a program that generates a random integer in the range 20 
//to 40, inclusive, and displays the sine, cosine, and tangent of that 
//number.

import java.util.Random;

public class RandomTrig{
    public static void main(String[] args)
    {
        Random generator= new Random();
        int num1; 

        num1=generator.nextInt(20)+20;
        System.out.println(num1);

        System.out.println(Math.sin(num1));
        System.out.println(Math.cos(num1));
        System.out.println(Math.tan(num1));

 

    }
  

}