//write a program that reads three integers and prints their average

import java.util.Scanner; 
public class Average{
    public static void main(String[] args)
    {
        int num1, num2,num3; 
        double average; 

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        num1= scan.nextInt();
        num2= scan.nextInt();
        num3= scan.nextInt();

        average=(num1+num2+num3)/3;
        System.out.println("Average: "+ average);

    }
}