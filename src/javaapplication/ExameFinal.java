package javaapplication;

import java.util.Scanner;

public class ExameFinal {
 public static void main(String[]args)
 {
     double average;
     int daysAbsent;
  
     Scanner reader = new Scanner (System.in);
     System.out.println("Este programa determinará se você conseguirá passar no exame final.");
     System.out.println("Por favor, responda às seguintes perguntas.");
     System.out.println("Qual é a sua média na classe?");
     average = reader.nextDouble();
     
     System.out.println("Quantas aulas você perdeu?");
     daysAbsent = reader.nextInt();
     
     if(average>=90 && daysAbsent<=3 || average>=80 && daysAbsent<=0)
         System.out.println("Parabéns! Você está dispensado do exame final.");
     else
         System.out.println("Você não está isento do exame final.");
}}
