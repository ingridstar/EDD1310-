/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

/**
 *
 * @author IngridAmayranee
 */

import java.util.HashSet;
import conjuntos.conjuntoadt;

public class valoresDeConjuntos {
    
    
  public static void main(String [] args){
      
      HashSet<conjuntoadt> union,interseccion, diferencia;
      conjuntoadt<Integer> lk=new conjuntoadt<>();
      HashSet<Integer> ls = new HashSet<>();
      
      lk.aniadirDato(6);
      lk.aniadirDato(5); 
      lk.aniadirDato(90);
      lk.aniadirDato(7);
      lk.aniadirDato(111);
      
      System.out.println(lk);
      
      lk.getLongitud();
      
      System.out.println("----Checamos el parametro que este dentro del conjunto----");
      lk.guarda(5);
      
      lk.eliminarDato(7);
      System.out.println("----Borra el numero 7----");
      System.out.println(lk);
      
      ls.add(5);
      ls.add(8);
      ls.add(88);
      ls.add(54);
      
      System.out.println("------------- M-Igual-------------");
        lk.Igual(ls);
        
        System.out.println("------------M-SubConjunto------------");
        lk.SubConjunto(ls);
        
        System.out.println("-------------M-Unión-------------");
        lk.union(ls);
        
        System.out.println("-------------M-Intersección-------------");
        lk.interseccion(ls);
        
        System.out.println("-------------M-Diferencia-------------");
        lk.diferencia(ls);
        
        System.out.println("-------------M-Iterador-------------");
        lk.iterador();
        
        System.out.println("-------------A D I O S :3-------------");
      
  }
}
