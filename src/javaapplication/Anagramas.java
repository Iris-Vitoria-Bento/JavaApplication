package javaapplication;

import java.util.Scanner;

public class Anagramas {

public static void main(String[]args){
       Scanner reader = new Scanner(System.in);
       String word;
       String word2;
       char c;
    System.out.println("Digite uma palavra ou frase : ");
    word= reader.nextLine();
    
    System.out.println("Digite outra palavra ou frase :");
    word2 = reader.nextLine();
    
    boolean anagrama = true;
    for(int i = 0; i< word.length();i++)
    {  
        c=word.charAt(i);
        if(word2.indexOf(c)== -1){
               anagrama=false;
               break;
        }
}
 if(anagrama)
            System.out.println("As frases/palavras são anagramas.");
 else
            System.out.println("As frases/palavras não são anagramas.");
    
    }
}
