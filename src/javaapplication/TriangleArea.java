
package javaapplication;

import java.util.Scanner;


public class TriangleArea {
    public static void main(String[] args)
{
    double base,height,area;
    Scanner reader= new Scanner(System.in);
    
    System.out.println("Enter the base of the triangle");
    base=reader.nextDouble();
    
    System.out.println("Enter the height of the triangle");
    height=reader.nextDouble();
    
    area=(double)1/2*base*height;
    
    System.out.println("The area is"+ area+".");
    
}
Math.sqrt((Math.pow(x,5)-6)/4);