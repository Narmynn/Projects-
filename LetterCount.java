//Reads a sentence from the user 
//and counts the number of uppercase and lowercase
//letters contained in it

import java.util.Scanner;
class LetterCount{
    public static void main(String[] args){
        final int NUMCHARS=26;
        Scanner scan= new Scanner(System.in);

        int[] upper= new int[NUMCHARS];
        int[] lower=new int[NUMCHARS];

        char current; //the current character being processed
        int other=0; //counter for non-alphabetics

        System.out.println("Enter a sentence");
        String line=scan.nextLine();

        //Count the number of each letter occurrence
        for(int ch=0;ch<line.length();ch++)
        {
            current=line.charAt(ch);
            if(current>='A'&& current<='Z')
              upper[current-'A']++;
            else
              if(current>='a'&&current<='z')
              lower [current-'a']++;
              else 
               other++;
        }
        System.out.println();
        for(int letter=0;letter<upper.lenth; letter++){
            System.out.print((char)(letter+'A'));
            System.out.print(": "+upper[letter]);
            System.out.print("\t\t"+(char)(letter+'a'));
            System.out.print(": "+lower[letter]);
        }
        System.out.println();
        System.out.println("Non-alphabetic characters: "+other );    
    }
}