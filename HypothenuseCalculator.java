import java.util.Scanner;

class HypothenuseCalculator{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        double side1,side2;
        double hypo;

        System.out.println("Enter the values of sides: ");
        side1=scan.nextDouble();
        side2=scan.nextDouble();
        System.out.println("Sides: "+ side1 +" " + side2);

        hypo=Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("Hypothenuse: "+ hypo);



    }
}