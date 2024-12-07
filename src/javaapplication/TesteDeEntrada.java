
package javaapplication;

import java.util.Scanner;

public class TesteDeEntrada {

public static void main(String[] args)
{
String valdictorian;
double gpa;
int totalStudents, satScore;
boolean qualify = false;

Scanner reader = new Scanner ( System.in);
System.out.println("Este programa determinará se você pode entrar na Mountville University.");
System.out.println(" Por favor, responda às seguintes perguntas. ");
System.out.println("Quantos alunos frequentavam sua escola?");
totalStudents = reader.nextInt();

if(totalStudents>=1400)
{
  System.out.println("Você foi orador ou algo do tipo da sua escola? Responda S/N\"");

         valdictorian =  reader.next();
         if(valdictorian.equals("S"))
            qualify = true;
}
if(!qualify)
{
        System.out.println("Qual foi a sua média de notas em uma escala de 4,0?");
        gpa=reader.nextDouble();
        System.out.println("Qual foi sua pontuação no SAT?");
        satScore=reader.nextInt();
        if(gpa >= 4.0 && satScore >=1100 || gpa >=3.5 && satScore>=1300 ||gpa >=3.0 && satScore>=1500)
                qualify= true; 
}
if(qualify)
    System.out.println("Parabéns! Você se qualifica para a Mountville University.");
else
    System.out.println("Lamento que você não se qualifique para a Mountville University.");
    
}
    
}
