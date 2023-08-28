import java.util.Scanner; 

public class Tempconverter{
    public static void main(String[] args){
    final int BASE = 32;
    final double ConversionFactor= 5.0/9.0;

    double celciusTemp,fahTemp;

    Scanner scan = new Scanner(System.in);

    System.out.println("Fahrenheit: ");
    fahTemp=scan.nextDouble();

    celciusTemp = ConversionFactor * (fahTemp-BASE);
    System.out.println("Celcius: " + celciusTemp);

    }
}