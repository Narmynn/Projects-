import java.util.Scanner; 

public class Info {
    public static void main(String[] args){
     
    String name,college,petName; 
    int age;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please give infomation about yourself: ");

    name=scan.nextLine();
    college=scan.nextLine();
    petName=scan.nextLine();
    age=scan.nextInt(); 


    System.out.print("Hello,my name is "+ name+ "and I am " + age + "years old \n" +
                     "I'm enjoying my time at " + college +"\n,though I miss my pet" 
                      + petName + "very much!");

    

    }

}