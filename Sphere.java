//Write a program that reads the radius of a sphere and prints its 
//volume and surface area. Use the following formulas. Print the 
//output to four decimal places. r represents the radius.

import java.util.Scanner; 

public class Sphere{
    public static void main(String[] args)
    {
        final double pi=3.14; 
        double volume, surfaceArea;
        double rad; 

        System.out.println("Radius: ");
        Scanner scan= new Scanner(System.in);
        rad=scan.nextDouble(); 
        System.out.println("Radius: "+ rad);

        volume=(4/3)*pi*(Math.pow(rad,3));
        surfaceArea= 4*pi*rad*rad; 

        System.out.print("Volume: " + volume + " Surface Area: "+ surfaceArea);





    }

}