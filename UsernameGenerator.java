//Write a program that prompts for and reads the user’s first and 
//last name (separately). Then print a string composed of the first 
//letter of the user’s first name, followed by the first five characters of the user’s last name, followed by a random number in the 
//range 10 to 99. Assume that the last name is at least five letters 
//long. Similar algorithms are sometimes used to generate usernames for new computer accounts.


import java.util.Random;
import java.util.Scanner;


public class UsernameGenerator
{
    public static void main(String[] args)
    {
        String name;
        String surname; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        name=scan.nextLine();
        System.out.println("Surmame: ");
        surname=scan.nextLine();

        System.out.println("Name: "+ name+ ", Surname: "+surname);

       String username1,username2,username3; 
       username1=name.substring(0,1);
       username2=username1.concat("Aliye");

       System.out.println("Username: "+username1);
       System.out.println("Username2: "+username2);

       Random generator= new Random();
       int num1; 

       num1=generator.nextInt(89)+10;
       System.out.println("From 10 to 99" + num1);
       
       username3=username2+num1;
       System.out.println("Username3: "+username3);




    }
}