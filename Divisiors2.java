//Assume the int variable value has been initialized to a positive 
//integer. Write a while loop that prints all of the positive divisors of 
//each number from one to value.



import java.util.Scanner;

class Divisors{
    public static void main(String[] args)
    {
        int count=1,count2;
        int value;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        value=scan.nextInt();

        while(count<=value)
        {
            System.out.println(count);
            count2=1;
            while(count2<=count)
            {
                if((count%count2)==0)
                System.out.println(count2);
                count2++;
            }
            System.out.println();
            count++;
        }

    }
}