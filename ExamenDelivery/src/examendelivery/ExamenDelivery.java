/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examendelivery;
import java.util.Scanner;

public class ExamenDelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
         
        System.out.println("----MENU----");
        System.out.println("1. Cliente");
        System.out.println("2. Vendedor");
        System.out.println("2. Repartidor");
        System.out.print("Elija el usuario al que corresponde: ");
        opcion= entrada.nextInt(); 
        
        
        
      if (opcion == 1) {
              Cliente client1 = new Cliente("Fernando","Residencial Valle Azul","Zapatos deportivos", 2000);
              System.out.println("\n");
                client1.mostrarDatosCliente(); 
                } 
      
      if (opcion ==2) {
               Vendedor vend1 = new Vendedor ("Luis", 7263838);
               System.out.println("\n");
               vend1.mostrarDatosVendedor();
              }
      if (opcion ==3) {
                Repartidor repar1 = new Repartidor ("Felipe","20 minutos");
                System.out.println("\n");
                repar1.mostrarDatosRepartidor();
      }
        }
    }
    

