import java.util.Scanner; 
public class SmallestValue{
    public static void main(String[] args)
{
    int num1, num2,num3, min;
    System.out.println("Enter 3 numbers: ");
    Scanner scan= new Scanner(System.in);
    num1=scan.nextInt();
    num2=scan.nextInt();
    num3=scan.nextInt();

    if(num1<num2)
    {

       {
        if(num1<num3)
         min=num1;
       }
     
        min=num3;
    }

    else

    
        if(num2<num3)
        {
            min=num2; 
        }
        else 
            min=num3;
    
    System.out.println("Minimum value: "+ min);


 }
}