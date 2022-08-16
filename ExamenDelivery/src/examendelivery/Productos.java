/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendelivery;

public class Productos {
    String producto;
    int precio; 
   
    public Productos (String producto, int precio) {
    this.producto = producto;
    this.precio = precio; 
        
    }  
    public String getProducto () {
    return producto; 
    }
    public int getPrecio () {
    return precio; 
    }
}   
