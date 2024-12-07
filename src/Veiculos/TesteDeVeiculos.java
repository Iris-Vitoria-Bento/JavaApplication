
package Veiculos;

public class TesteDeVeiculos {

 public static void main(String[] args) {
 System.out.println("Fabricante : " + Vehicle.MAKE);
 System.out.println("Número de veículos fabricados: " + Vehicle.numVeiculos);
 
 Vehicle vehicle1 = new Vehicle("Vision");
 System.out.println(vehicle1);
 
 Vehicle vehicle2 = new Vehicle("Edict");
 System.out.println(vehicle2);
 
 vehicle2.setMake("Seer");
 System.out.println(vehicle1);
 System.out.println(vehicle2);
 
 Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
 System.out.println("Número do veículo " + vehicle3.getChassisNo() + " é um " 
 + vehicle3.getModel() + " modelo tem uma cilindrada de " 
 + vehicle3.getCapacity() + "cc");
 
 
 System.out.println("Número de veículos fabricados: " + Vehicle.numVeiculos);
 }
}