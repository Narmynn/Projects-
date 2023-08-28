//Manav Kasa Programı
//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram 
//değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

//Meyveler ve KG Fiyatları

/*Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

import java.util.Scanner; 
class ManavKasiProgrami{
    public static void main(String [] args){
        double armut = 2.14 ;
        double elma = 3.67 ;
        double domates = 1.11 ;
        double muz= 0.95;
        int patlican =5;

        double total= armut+elma+domates+muz+patlican; 



        Scanner scan= new Scanner(System.in);
        System.out.println("Kac kilo aldiginiz belirtin lutfen: ");

        armut=scan.nextDouble();
        elma=scan.nextDouble();
        domates=scan.nextDouble();
        muz=scan.nextDouble();
        patlican=scan.nextInt();


        System.out.println("Total sum: "+ total);



        




    }
}

