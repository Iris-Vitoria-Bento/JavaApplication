package javaapplication;

import java.util.Scanner;

public class ViagemDeCampo {

public static void main(String[]args)
  {
  int numberPeople, numberBuses, peopleInVans;
  String planet;
  Scanner reader= new Scanner(System.in);
  
  System.out.println("Insira o número de pessoas que estão inscritas na viagem de campo");
  numberPeople=reader.nextInt();
  numberBuses=numberPeople/45;
  peopleInVans=numberPeople%45;
  
  System.out.println("Ira preciar de "+ numberBuses + " ônibus. O número de pessoas que precisarão viajar em vans ira ser :"+
          peopleInVans+".");

  }  
}
