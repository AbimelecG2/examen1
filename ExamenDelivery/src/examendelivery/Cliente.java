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
   protected String direccion;
   protected  String producto;
   protected  int precio; 
    
    public Cliente(String nombre, String direccion, String producto, int precio){
    super (nombre);
    this.direccion=direccion;
    this.producto=producto;
    this.precio=precio;
    }

   public void mostrarDatosCliente(){
   
   System.out.println("Nombre: "+getNombre()+ "\nDireccion: "+direccion+ "\nEl producto que lleva es: "+producto+ "\nEl precio de producto es: "+precio);
   }  
}
