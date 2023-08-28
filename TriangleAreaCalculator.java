//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan 
//ve hipotenüsü hesaplayan programı yazın.

//Ödev
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

//Formül
//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

//𝑢 = (a+b+c) / 2

//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

import java.util.Scanner;

class TriangleAreaCalculator{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int a,b,c;
        double area; 

        System.out.println("Enter the side of triangle: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        double u=(a+b+c)/2;
        double circum=2 * u; 
        area * area=u * (u-a) * (u-b) * (u-c);

        System.out.println(u+ circum+ area);

    }
}