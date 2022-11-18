/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_pilas;
import pilasadt.PilasADT;

/**
 *
 * @author IngridAmayranee
 */
public class Stack { 
    public static void main(String[] args) {
        PilasADT pila = new PilasADT();
        
        //Aniadimos datos a pila 
        pila.push("Bienvenido");
        pila.push(9);
        pila.push(68);
        pila.push(0);
        pila.push(4);
        pila.push(30);
        pila.push(111);
        
        //Presentaamos la pila en monitor
        System.out.println(pila);
         //Presentamos en pantalla si está vacía o no
        System.out.println("\n¿Se encuentra la pila vacía?: " + pila.isEmpty());
        
        //Presentamos en pantaalla el método para mostrar los elementos que tiene nuestra pila
        System.out.println("\nSu tamanio es: " + pila.length());
       
        //Presentamos en pantalla el método que elimina el elemento tope de la pila
        System.out.println("\nEl elemento eliminado es: " + pila.pop());
        
        //Presentamos en pantalla este elemento tope de la pila
        System.out.println("\nEl elemento consultado es: " + pila.peek());
        
        //Presentamos toString en pantalla
        System.out.println("\nPila Final después de pruebas: " + pila.toString());
        
    }
    
}

