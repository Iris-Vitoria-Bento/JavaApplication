
package Inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteDeProduto {
     public static void main(String[]args){
        
//criar um objeto Scanner para entrada do teclado

     Scanner in = new Scanner(System.in);
        int maxSize, menuChoice;
        
        maxSize = getNumProducts(in);
        if(maxSize ==0){

            //Exibir uma mensagem de que não há produto se zero for inserido

          System.out.println("Não há produtos!");
          }else{
 Produto[] Produtos = new Produto[maxSize];
            addToInventory(Produtos,in);
            do{
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, Produtos, in);
              }while(menuChoice!=0);
            } //fim do if
}//encerrar metodo principal
   static void executeMenuChoice (int choice,Produto[] Produtos, Scanner in){
           switch(choice){
               case 1: System.out.println("Exibir Lista de Produtos");
                           displayInventory(Produtos);
                    break;
               case 2: System.out.println("Adicionar Estoque");
                          addInventory(Produtos,in);
                    break;
               case 3: System.out.println("Deduzir estoque");
                         deductInventory(Produtos,in);
                    break;
               case 4: System.out.println("Descontinuar Estoque");
                         discontinueInventory(Produtos, in);
                    break;
           }//encerra switch
    }// encerra o método executeMenuChoice
 
   
   
    static void discontinueInventory(Produto[] Produtos, Scanner in ){
          int productChoice;

          productChoice=getProductNumber(Produtos, in);
    Produtos[productChoice].setActive(false);
          
    }//Encerra método deductInventory

static void deductInventory(Produto[] Produtos, Scanner in ){
       int productChoice;
       int updateValue= -1;
       productChoice=getProductNumber(Produtos,in);
       do{
          try{
           System.out.print("Quantos produtos deseja deduzir?");
           updateValue= in.nextInt();
           if(updateValue< 0)
           System.out.println("Insira apenas valores positivos para deduzir do estoque");
          
           if(updateValue > Produtos[productChoice].getQtyInStock())
               System.out.println("não há estoque suficiente para remover essa quantidade; restam "
                                  + Produtos [productChoice].getQtyInStock ()+" somente!");
                    
            }catch(InputMismatchException e) {
                   System.out.println("Tipo incorreto de dados inserido!");
                   in.nextLine();
            }catch(Exception e){
                   System.out.println(e);
                   in.nextLine();
            }
     }while(updateValue< 0 ||updateValue >Produtos[productChoice].getQtyInStock());
 
  Produtos[productChoice].deductFromInventory(updateValue);
  
}// Encerrar método deductInventory


static void addInventory(Produto[]Produtos, Scanner in){
       int productChoice;
       int updateValue=-1;
       productChoice=getProductNumber(Produtos,in);
       do{
           try{
            System.out.print("Quantos produtos deseja adicionar?");
            updateValue = in.nextInt();
            if(updateValue <0)
            System.out.println("Insira apenas valores positivos para adicionar ao estoque");
         //endif
         
        }catch(InputMismatchException e){
               System.out.println("Tipo incorreto de dados inserido!");
               in.nextLine();
        }catch(Exception e) {
               System.out.println(e);
               in.nextLine();
        }
    }while(updateValue <0);

   Produtos[productChoice].addToInventory(updateValue);
}//encerrar método addInventory

static int getProductNumber(Produto[] produtos,Scanner in){
       int productChoice=-1;
       //exibir o conteúdo do array de produtos

 for(int i=0; i< produtos.length; i++)
      System.out.println(i+ " : " + produtos[i].getName());
      //endor
    do{
        try{
      System.out.print("Insira o número do item do produto que deseja atualizar:");
     productChoice = in.nextInt();
    if(productChoice <0|| productChoice > produtos.length-1)
      System.out.println("Insira somente valores entre 0 e "
                         +(produtos.length-1));
//endif
} catch(InputMismatchException e) {
        System.out.println("Tipo incorreto de dados inserido!");
        in.nextLine();
}catch(Exception e){
     System.out.println(e);
     in.nextLine();
}
}while(productChoice <0 ||productChoice > produtos.length-1);

 return productChoice;
}//encerrar método getProductNumber

static int getMenuOption(Scanner in){
       int menuOption=-1;
       
       //exibir menu até que uma entrada válida seja fornecida
       do {
         try{
             System.out.println("\n\n1. Exibir Inventario\n2. Adicionar Estoque\n3.Deduzir Estoque\n"
            +"4.Descontinuar Produto\n0. Sair");
             System.out.print("Insira uma opção do menu:");
            menuOption = in.nextInt();
}catch(InputMismatchException e){
             System.out.println("Tipo incorreto de dados inserido!");
             in.nextLine();
}catch(Exception e){
             System.out.println(e);
             in.nextLine();
}
}   while(menuOption <0|| menuOption >4);
       
   //retornar a entrada válida do usuário    
    return menuOption;
}//encerrar método getMenuOption


static int getNumProducts(Scanner in) {
       int maxSize = -1;
       
       //solicitar que o usuário insira um número >= zero
       do{
          
           try{
                //exibir prompt para o usuário
       System.out.println("Insira o número de produtos que gostaria de adicionar.");
 
       System.out.print("Insira 0 (zero) se não quiser adicionar produtos: ");
       //exibir prompt para o usuário
       
       maxSize = in.nextInt();
       if(maxSize<0)
             System.out.println("Valor Incorreto inserido");
          //endif
}
 catch(InputMismatchException e){
             System.out.println("Tipo incorreto de dados inserido!");
             in.nextLine();
}catch (Exception e){
        System.out.println(e);
        in.nextLine();
}
}while(maxSize<0);

//retorna o valor válido inserido pelo usuário       
 return maxSize;
     }//encerrar método getNUmProducts

static void addToInventory(Produto[] Produtos, Scanner in){
      //criar variáveis locais
      int stockChoice=-1;
   for(int i = 0; i<Produtos.length; i++){
   //exibir menu até que uma entrada válida seja fornecida    
   do{
      try{
   //pedir ao usuário para inserir as informações sobre o produto    
          System.out.println("\n1: CD\n2: DVD");
          System.out.print("Insira o tipo de produto:");
          stockChoice = in.nextInt();
          if(stockChoice <1 || stockChoice >2)
          System.out.println("Somente os números 1 ou 2 são permitidos!");
//endif
}catch(InputMismatchException e) {
      System.out.println("Tipo incorreto de dados inserido!");
     in.nextLine();
}catch(Exception e) {
       System.out.println(e);
       in.nextLine();

  }
}while(stockChoice <1 || stockChoice >2);
if(stockChoice==1)
        addCDToInventory(Produtos, in, i);
else
        addDVDToInventory(Produtos, in,i);
//endif
  }//endfor
}//encerrar método addToInventory

static void addCDToInventory(Produto[] Produtos, Scanner in, int i){
       //encerrar método addToInventory
       int tempNumber;
       String tempName;
       int tempQty;
       double tempPrice;
       String tempArtist;
       int tempNumSongs;
       String tempLabel;
       //limpar o buffer de entrada
       in.nextLine();
//pedir ao usuário para inserir as informações sobre o produto
       System.out.print("\n\nInsira o nome do CD: ");
       tempName = in.nextLine();
       System.out.print("Insira o nome do artista:");
       tempArtist = in.nextLine();
       System.out.print("Insira o nome do selo de gravação: ");
       tempLabel = in.nextLine();
       System.out.print("Insira o número de músicas:");
       tempNumSongs = in.nextInt();
       System.out.print("Insira a quantidade em estoque para este produto: ");
       tempQty = in.nextInt();
       System.out.print("Insira o preço para este produto: ");
       tempPrice = in.nextDouble();
       System.out.print("Insira o número do item: ");
       tempNumber = in.nextInt();
       
//criar um objeto Produto CD e armazená-lo no array de produtos
Produtos[i] = new CD(tempNumber, tempName, tempQty, tempPrice, tempArtist, 
tempNumSongs, tempLabel);
}//criar um objeto Produto CD e armazená-lo no array de produtos

static void addDVDToInventory(Produto[] produtos, Scanner in, int indexValue) {
       //criar variáveis locais
       int tempNumber;
       String tempName;
       int tempQty;
       double tempPrice;
       int tempLength;
       int tempRating;
       String tempStudio;
      //limpar o buffer de entrada
      in.nextLine();
 //pedir ao usuário para inserir as informações sobre o produto
 System.out.print("\n\nInsira o nome do DVD: ");
 tempName = in.nextLine();
 System.out.print("Insira o nome do estúdio cinematográfico: ");
 tempStudio = in.nextLine();
 System.out.print("Insira a classificação etária: ");
 tempRating = in.nextInt();
 System.out.print("Insira a duração em minutos: ");
 tempLength = in.nextInt();
 System.out.print("Insira a quantidade em estoque para este produto: ");
 tempQty = in.nextInt();
 System.out.print("Insira o preço para este produto: ");
 tempPrice = in.nextDouble();
 System.out.print("Insira o número do item: ");
 tempNumber = in.nextInt();
 
//criar um objeto Produto DVD e armazená-lo no array de produtos
 produtos[indexValue] = new DVD(tempNumber, tempName, tempQty, tempPrice, tempLength, 
 tempRating, tempStudio);
 }//encerrar método addDVDToInventory
 
 static void displayInventory (Produto[] Produtos) {
 //exibir o conteúdo do array de produtos
 for(Produto produto: Produtos)
 System.out.println(produto);
 //endor
}//encerrar método displayInventory
}//encerrar classe ProductTester
