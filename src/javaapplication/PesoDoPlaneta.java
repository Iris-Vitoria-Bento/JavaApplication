package javaapplication;

import java.util.Scanner;

public class PesoDoPlaneta {

public static void main(String[]args)
{
    double weight, newWeight, conversion;
    int choice;
    String Planeta;
    Scanner reader = new Scanner (System.in);
    
    System.out.print("Digite seu Peso na Terra: ");
    weight=reader.nextDouble();
    
    System.out.println("Escolha um Planeta: ");
    System.out.println("1. Mercury");
    System.out.println("2. Venus");
    System.out.println("3. Mars");
    System.out.println("4. Jupter");
    System.out.println("5. Saturn");
    System.out.println("6. Uranus");
    System.out.println("7. Neptune");
    choice=reader.nextInt();
    if(choice==1)
    { 
        Planeta="Mercury";
        conversion=.38;
    }else if(choice==2)
        
    { Planeta="Venus";
      conversion=.91;
    }else if(choice==3)
        
    { Planeta="Mars";
      conversion=.38;
    }else if(choice==4)
    
    { Planeta="Jupiter";
      conversion=2.36;
    }else if(choice==5)
    
    { Planeta="Saturn";
      conversion=.92;
    }else if(choice==6)
        
    {Planeta="Uranus";
     conversion=.89;
    }else if(choice==7)
    
    {Planeta="Neptune";
     conversion=1.125;
    }
else
{ Planeta=" Sem escolha";
  conversion=0;
}
newWeight=weight*conversion;
 System.out.println(" Seu peso " + Planeta + " seria " + newWeight + "."); 
}
}
