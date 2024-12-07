
package javaapplication;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args)
{
    double base,height,area;
    Scanner reader= new Scanner(System.in);
    
    System.out.println("Insira a base do triângulo");
    base=reader.nextDouble();
    
    System.out.println("Insira a altura do triângulo");
    height=reader.nextDouble();
    
    area=(double)1/2*base*height;
    
    System.out.println("A Area deve ser "+ area+" .");
    
}
}
