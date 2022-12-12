/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd1310.hashm;

import java.util.HashMap;
/**
 *
 * @author IngridAmayranee
 */
public class HashM {

public static void main(String[] args) {
        
    //Ingresamos dos datos porque al ser un hash por defecto tiene una clave y un valor 
        HashMap <Integer,String>map= new HashMap<>(); 
        map.put(267, "Ricardo"); //aqui comienzamos a aniadir el primer dato 
            map.put(389,"Olalde");
                 map.put(545, "Fer");
        
        System.out.println(map);
            System.out.println("--------");
                System.out.println("el valor es:");
    //Con este llamamos a un solo dato ,el cual tiene el mismo valor o clave
                    System.out.println(map.get(545)); 
        
        System.out.println("--------");
            map.remove(389); //eliminamos del hash
            System.out.println(map);
                System.out.println("--------");
        
        if(map.containsKey(267)){
        // Indica que estamos buscando un valor por su clave 
            System.out.println("el nombre del elemento a obtener es:"+map.get(267)); 
        }
        System.out.println("--------");
        
        if (map.containsKey(85)) {
            System.out.println("es:"+map.get(85));
           
        //Se mapea la clave,como no se encuentra se muestra en la pantalla un mensaje que dice "no existe ese dato con la clave proporcionada"
        } else{
            System.out.println("no existe ese dato con la clave proporcionada");
        }
        System.out.println("--------");
              for (Integer indice: map.keySet()) {
        //Metodo para mostrar en pantalla los datos del hash
                  System.out.println(map.get(indice)); 
        }
        
    }
    
}
   