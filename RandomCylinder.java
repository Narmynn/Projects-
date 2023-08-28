//Write a program that generates a random integer radius (r) and 
//height (h) for a cylinder in the range 1 to 20, inclusive, and then 
//computes the volume and surface area of the cylinder.


import java.util.Random;

public class RandomCylinder{
    public static void main(String[] args){

       Random generator= new Random();
       int rad, height;
       final int pi= 3 ; 
       int volume, surface; 

       
       rad=generator.nextInt(20)+1;
       height=generator.nextInt(20)+1;
       System.out.println("Radius: " +rad);
       System.out.println("Height: "+ height);

        volume= pi* rad*rad*height; 
         surface= 2*pi*rad*height; 

       System.out.println("Volume: "+   volume + " Surface: " +   surface);

    }
}