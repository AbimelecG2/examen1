/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendelivery;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Usuarios {
    Scanner entrada = new Scanner(System.in);
    String nombre;
   
    public Usuarios (String nombre){
    this.nombre = nombre; 
    }
    
    public String getNombre () {
    return nombre; 
    }
}
