/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendelivery;

/**
 *
 * @author USER
 */
public class Cliente extends Usuarios {
    String direccion;
    
    
    public Cliente(String nombre, String direccion){
    super (nombre);
    this.direccion = direccion;
    }
   public void mostrarDatosCliente(){
   
   System.out.println("Nombre: "+getNombre()+ "\nDireccion: "+direccion);
   }  
}
