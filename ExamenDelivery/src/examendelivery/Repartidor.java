/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendelivery;

/**
 *
 * @author USER
 */
public class Repartidor extends Usuarios{
     int tiempoEntrega;
    
    
    public Reapartidor(String nombre, inttiempoEntrega ){
    super(nombre);
    this.tiempoEntrega=tiempoEntrega;
    }
   public void mostrarDatosRepartidor(){
   
   System.out.println("Nombre: "+getNombre()+"\nTiempo de Entrega: "+tiempoEntrega);
   } 
}
}
