
package javaapplication;

import java.util.Scanner;

public class MediaDeTeste {
  public static void main(String[]args){
   Scanner in = new Scanner(System.in);
   double[]scores = new double [5];
   double total = 0;
   double avg = 0;
    for(int i =0; i<5;i++){
     
        System.out.println("Insira uma pontuação de teste: ");
        scores[i] = in.nextDouble();
       total+=scores[i];
    }
       avg = total/5;
       System.out.println("A média dessas pontuações de teste é:" + avg);
    
  }
   
  }  
