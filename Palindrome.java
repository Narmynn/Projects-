import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
         
    
        String x;
        int i = 0, j = x.length() - 1;
        while(i < j)
        {
            if(x.charAt(i) != x.charAt(j))
            {
                System.out.println("Not palindrome ");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}

    
