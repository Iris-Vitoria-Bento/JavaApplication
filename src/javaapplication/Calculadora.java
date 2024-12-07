package javaapplication;

import java.util.Scanner;

public class Calculadora {
    
public static void main(String args[]){
    
 Scanner scan = new Scanner(System.in);
double num1 = 0, num2 = 0, answer = 0;
 char operator = ' ';
 String line = " ";
 
  System.out.print("Enter a double: ");
      num1 = scan.nextDouble();
      
      System.out.print("Enter another double :");
      num2 = scan.nextDouble();
      
      System.out.print("Enter an operator: ");
      line = scan.next();
      operator = line.charAt(0);
       switch (operator){
           case '*':
                answer = num1 * num2;
                break;
           case'/':
                answer = num1 / num2;
                break;
           case'-':
               answer = num1 - num2;
               break;
           case'+':
               answer = num1 + num2;
               break;
           case'%':
               answer = num1 % num2;
               break;
           default:
               System.out.println("Invalid operator");
               System.exit(1);
       }
       System.out.println("answer:" + answer);
}
}
    