package UmProjetoDeInventário;

import Inventario.Produto;

public class ProdutoTeste {
 
    public static void main(String[]args){
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        Produto p3 = new Produto(3,"Hot Shots", 75,8.99);
        Produto p4 = new Produto(4, "Brothers InArms", 200,7.75);
        Produto p5 = new Produto(5, "Fantastic", 500, 9.50);
        Produto p6 = new Produto(6, "Fantastic", 500, 9.50);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
