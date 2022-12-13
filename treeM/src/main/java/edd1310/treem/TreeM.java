/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd1310.treem;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author IngridAmayranee
 */
public class TreeM {

public static void main(String[] args) {
        // TODO code application logic here
        
        //Le decimos como va estar compuesto 
        Map<Integer,String> treemap= new TreeMap<Integer,String>();
         
        treemap.put(35, "Mar");
            treemap.put(50, "Azul");
                treemap.put(93, "Nat"); //El put sirve para insertar
                System.out.println(treemap);
        
        
        treemap.remove(35);
        // le decimos que elimine un dato
            System.out.println("---Elimina un valor---");
                System.out.println(treemap);
        
        System.out.println("--------");
        // Recuperamos un dato
            System.out.println("el valor es:"); 
                System.out.println(treemap.get(93));
                    System.out.println("--------");
        if(treemap.containsKey(50)){
            System.out.println("El valor es:"+treemap.get(50)); // Este es para obtener un valor
        } else{
            System.out.println("Valor no encontrado");
        }
        System.out.println("-------");
         if(treemap.containsKey(71)){
            System.out.println("El valor es:"+treemap.get(71));  
        } else{
            System.out.println("No existe este valor dado");
            
        }
         System.out.println("Remplaza ");
            treemap.replace(77, "Nicol");     //Cambia el un valor asignado 
         System.out.println(treemap);
         System.out.println("---sin dato---");
         treemap.clear();
            System.out.println(treemap);
         System.out.println("----aniade de nuevo----");
         treemap.put(66,"Irany");
            System.out.println(treemap);
    }
    
}
    
