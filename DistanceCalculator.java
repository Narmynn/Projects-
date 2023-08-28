//Write a program that reads the (x,y) coordinates for two points. 
//Compute the distance between the two points using the following formula:
//Distance =sqrt (x2 - x1)2 - (y2- y1)2

import java.util.Scanner;

public class DistanceCalculator{
    public static void main(String[] args)
    {
       int x1 ,x2, y1,y2; 
       double distance; 
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter two points: ");
       x1=scan.nextInt();
       x2=scan.nextInt();
       y1=scan.nextInt();
       y2=scan.nextInt();
 
      distance=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y2-y1),2));
      System.out.println("Distance: " +distance);







    

    }

}