//A geometric series is a series of numbers with a constant ratio 
//between successive terms. In order to know the nth term in this 
//series, the formula that can be used is:
//an = a1 . r n - 1
//Here, an is the nth term, a1 is the first term, and r is the common 
//ratio. Write a program that accepts the first term, the common 
//ratio, and the value n from the user, and calculates the nth term 
//of the series

import java.util.Scanner;

public class GeometricSerie{
    public static void main(String[] args)
    {
        int a1 ,n, r; 
        int nthTerm; 
        System.out.println("Enter first term(a1), the nth term(n) and common ratio(r)");
        Scanner scan= new Scanner(System.in);
        a1=scan.nextInt();
        n=scan.nextInt();
        r=scan.nextInt();

        nthTerm= a1*((int)Math.pow(r,n-1));
        System.out.println("Nth term: " + nthTerm);





    }
}