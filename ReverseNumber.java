import java.util.Scanner; 
class ReverseNumber{
    public static void main(String [] args)
    {
        
        int n; 
        int reverse=0, lastDigit; 

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        n =scan.nextInt();
        
        while(n >0){
             

            lastDigit=n%10;
            reverse= reverse*10 +lastDigit;
            n=n/10;
        }
        System.out.println(reverse);
    }
}