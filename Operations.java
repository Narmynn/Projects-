import java.util.Scanner; 

public class Operations{
    public static void main(String[] args){
      
      float num1, num2; 
      float sum, difference, product; 
      Scanner scan= new Scanner(System.in);
      
      System.out.println("Enter 2 floating numbers: ");
      num1=scan.nextFloat();
      num2=scan.nextFloat();

      sum = num1 + num2; 
      difference= num2-num1; 
      product= num1*num2; 

      System.out.println("Sum: "+ sum);
      System.out.println("Difference: "+ difference);
      System.out.println("Product: "+ product);
    }
}