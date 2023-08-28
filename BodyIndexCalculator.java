//Java ile kullanıcıdan boy ve kilo
// değerlerini alıp bir değişkene atayın.
// Aşağıdaki formüle göre kullanıcının 
//"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

//Formül
//Kilo (kg) / Boy(m) * Boy(m)

import java.util.Scanner;
class BodyIndexCalculator{
    public static void main(String[] args){
        int kilo; 
        double height; 
        double Bmi;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your body mass and height: ");
        kilo=scan.nextInt();
        height=scan.nextDouble();


        Bmi=kilo/(height*height);

        System.out.println("Your body mass index is: " +Bmi);





    }
}