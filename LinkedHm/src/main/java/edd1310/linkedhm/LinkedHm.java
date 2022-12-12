/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd1310.linkedhm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author IngridAmayranee
 */
public class LinkedHm {
 
    public static void main(String[] args) {
        
        Map<Integer,String> linked = new LinkedHashMap<Integer, String>();
        
        linked.put(7, "Zam");
        linked.put(4, "Fer");
        linked.put(18, "Sebas");
        linked.put(3, "Nick");
       
        
        System.out.println(linked);
             System.out.println("//////////");
        // conseguir un dato
            System.out.println("se obtiene a : "+linked.get(4)); 
        System.out.println("/////////");
        //Elimina un dato
        linked.remove(3); 
            System.out.println(linked);
        System.out.println("//////////");
        linked.replace(11,"Kiki");     //Reemplazamos el dato por otro
        System.out.println(linked);
        System.out.println("/////////////");
        linked.remove(18,"Sebas");
            System.out.println(linked); 
             System.out.println("/////////");
        linked.clear(); //Limpieza
            if (linked.isEmpty()){
            System.out.println("No existe este dato");
        }
        
    }
}
    

  