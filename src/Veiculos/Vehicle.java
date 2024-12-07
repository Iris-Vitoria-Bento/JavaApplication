
package Veiculos;


public class Vehicle {
    
 public final static String MAKE = "Augur";
 public static int numVeiculos = 0;
 
 private String chassisNo;
 private String model; 
 
 public Vehicle(){
     
 }

public Vehicle(String model){
  numVeiculos++;
  chassisNo= "ch" + numVeiculos;
  this.model = model;
  System.out.println("Veículo fabricado"); 
}

    void setMake(String seer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public static class Engine extends Vehicle{
   private static final String MAKE = "Predicter";
   private static final int CAPACITY = 1600;
   
   public Engine(String model) {
 super(model);
}


public static String getMAKE() {
 return MAKE;

}

public static int getCapacity() {
    return CAPACITY;
}
}

public void SetMAKE(String make){
    this.MAKE = make;
}

 public String getModel() {
    return model;
}

public void setModel(String model){
    this.model=model;
}
 
public String getChassisNo(){
   return chassisNo;
}

public void setChassisNo(String chassisno){
    this.chassisNo=chassisNo;
}

public String toString(){
    return "O veículo é fabricado por: "+ Vehicle.MAKE
            +"\nO modelo é"+ this.model
            +"\nO número do chassi é" + chassisNo
            +"\nA marca do motor é" + Engine.getMAKE()
            +"\n A capacidade do motor é" + Engine.getCapacity() + "cc";
}
    
}
