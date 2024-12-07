package javaapplication;

import java.util.Scanner;

public class EstimadorDePintura {

public static void main(String[]args)
{
    double  length, width, height, area, extraArea;
    int fiveLiter = 0, oneLiter = 0;
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Este programa determinará a quantidade ideal de tinta que deve "
             + " seja comprado para pintar seu quarto.");
    
    System.out.println("Qual é a altura do quarto?");
    height = reader.nextDouble();
    
    System.out.println("Qual é a largura do quarto?");
    width=reader.nextDouble();
    
    System.out.println("Qual é o comprimento da sala?");
    length=reader.nextDouble();
    
    area=2*height*length + 2*height*width + length*width;
    
    fiveLiter=(int)(area/1500);
    
    extraArea=area-fiveLiter*1500;
    
    oneLiter=(int)(extraArea/300);
    
    if(extraArea-oneLiter*300>0)
oneLiter++;
    
    if(oneLiter>=4)
    {
        fiveLiter++;
        oneLiter=0;
    }
    System.out.println("Você deveria comprar " + fiveLiter + " baldes de cinco litros a US$ 15 cada.");
     System.out.println("Você deveria comprar " + oneLiter + " baldes de um litro a US$ 4 cada.");
    
}
}
