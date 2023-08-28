//Write a program that converts miles to kilometers. (One mile 
//equals 1.60935 kilometers.) Read the miles value from the user 
//as a floating point value.


import java.util.Scanner; 

public class Distanceconverter{
    public static void main(String[] args)
    {
      final double  BASE= 1.60935;
      double  mile, kiloMeters; 
      
      Scanner scan= new Scanner(System.in);
      System.out.println("Miles: ");
      mile=scan.nextDouble();

      kiloMeters= mile*BASE; 
      System.out.println("Kilometers: "+ kiloMeters);
      
    }
}