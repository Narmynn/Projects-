//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
// ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

//(Not : KDV tutarını 18% olarak alın)

//KDV'siz Fiyat = 10;

//KDV'li Fiyat = 11.8;

//KDV tutarı = 1.8;

//Ödev
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
// tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı 
//hesaplayan programı yazınız.

import java.util.Scanner;
class KdvCalculator{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int price;
        System.out.println("Enter the price of the product");
        price=scan.nextInt();

        double newPrice;
        newPrice=(price*118)/100;

        System.out.println("New price with taxes is "+ newPrice
                                );
        

    }
}
