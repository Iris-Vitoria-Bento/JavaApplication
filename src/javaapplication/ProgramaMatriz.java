package javaapplication;

import java.util.Scanner;

public class ProgramaMatriz {
  public static void main(String []args){
     int[][] A = new int[2][2];
     int[][] B = new int[2][2];
     int choice;
     Scanner reader = new Scanner(System.in);
     do{
          menu();
          choice=reader.nextInt();
          switch(choice){
              case 1:
                  enterMatrix(A);
                  break;
              case 2:
                  enterMatrix(B);
                break;
               case 3:
                  add(A,B);
                  break;
               case 4:
                  subtract(A,B);
                  break;
               case 5:
                  multiply(A,B);
                  break;
               case 6:
                  break;
  
          }
     }while(choice!=6);
  }
  
  public static void menu(){
      
      System.out.println("1.Insira a Matriz A");
      System.out.println("2.Insira a Matriz B");
      System.out.println("3.Mostrar A + B");
      System.out.println("4.Mostrar A - B");
      System.out.println("5.Mostrar A * B");
      System.out.println("6.Sair");
  }
  public static void enterMatrix(int[][]a){
   
      Scanner reader = new Scanner(System.in);
      System.out.print("Insira o elemento na primeira linha e na primeira coluna: ");
      a[0][0] = reader.nextInt();
      
      System.out.print("nsira o elemento na primeira linha e na segunda coluna: ");
      a[0][1] = reader.nextInt();
      
      System.out.print("Insira o elemento na segunda linha e na primeira coluna:");
      a[1][0] = reader.nextInt();
      
      System.out.print("Insira o elemento na segunda linha e na segunda coluna:");
      a[1][1] = reader.nextInt();     
  }  
  public static void add(int[][]a, int[][]b){
     
      System.out.println("A+B is ");
      System.out.println((a[0][0]+b[0][0]) + "\t" + (a[0][1]+b[0][1]));
      System.out.println((a[1][0]+b[1][0]) + "\t" + (a[1][1]+b[1][1]));
  }
  public static void subtract(int[][] a,int[][] b){
     
      System.out.println("A-B is ");
      System.out.println((a[0][0]-b[0][0]) + "\t" + (a[0][1]-b[0][1]));
      System.out.println((a[1][0]-b[1][0]) + "\t" + (a[1][1]-b[1][1]));

  }
  public static void multiply(int[][]a,int[][]b){
      System.out.println("A*B is ");
      System.out.println((a[0][0]*b[0][0] + a[0][1]*b[1][0]) + "\t" + (a[0][0]*b[0][1] + a[0][1]*b[1][1]));
      System.out.println((a[1][0]*b[0][0] + a[1][1]*b[1][0]) + "\t" + (a[1][0]*b[0][1] + a[1][1]*b[1][1]));
  }
}
