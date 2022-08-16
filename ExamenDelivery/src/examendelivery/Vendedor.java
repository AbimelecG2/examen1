/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendelivery;

/**
 *
 * @author USER
 */
public class Vendedor extends Usuarios{
    int codigo;
    
    
    public Vendedor(String nombre, int codigo){
    super(nombre);
    this.codigo=codigo;
    }
   public void mostrarDatosVendedor(){
   
   System.out.println("Nombre: "+getNombre()+"\nCodigo: "+codigo);
   } 
}
