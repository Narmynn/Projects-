//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan 
//ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

//Ödev
//Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana 
//"Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

//Not : If ve Else kullanılmayacak...

import java.util.Scanner;
class AveragePatika{
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);

        double math,phy,chem,turk,his,mus;

        System.out.println("Enter your mathematics note: ");
        math=scan.nextDouble();
        System.out.println(math);

        System.out.println("Enter your physics note: ");
        phy=scan.nextDouble();
         

        System.out.println("Enter your chemistry note: ");
        chem=scan.nextDouble();
 
        System.out.println("Enter your turkish note: ");
        turk=scan.nextDouble();
 
        System.out.println("Enter your history note: ");
        his=scan.nextDouble();
 
        System.out.println("Enter your music note: ");
        mus=scan.nextDouble();

        double average; 
        average=(math+chem+phy+turk+mus)/5;

        System.out.println("Average: "+ average);

        

        

 


    }
}