//Java ile gidilen mesafeye (KM) göre taksimetre 
//tutarını ekrana yazdıran programı yazın.

//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 
//20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;
class TaksiMetre{
    public static void main(String [] args){
        int km;
        double perKm=2.20;
        double total=10;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter distance in terms of km");
        km=scan.nextInt();

        total+=km*perKm;   // total= total+(km*perKm)
        total=(total<20)?20 : total;
        System.out.print("Total price is: " + total); 



    }
    }


