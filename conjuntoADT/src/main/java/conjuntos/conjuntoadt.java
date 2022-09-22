/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package conjuntos;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author IngridAmayranee
 */
public class conjuntoadt<T> {
    int magnitud;
    HashSet<T> Conjunto = new HashSet<>();

public conjuntoadt(){  
}
public int getLongitud(){
    magnitud= Conjunto.size();
    
    return(int) this.magnitud;
}

public void guarda(T dato){
   boolean lugar =Conjunto.contains(dato); //agregar comentario
   
   if(lugar == true){
       System.out.println("Elemento '" + dato + "' se esta en la lista, no se aniade"); 
   } else {
       System.out.println("Elemento '" + dato + "' no esta dentro del arreglo"); 
 
   }
}
    public void aniadirDato(T dato){
        boolean posicion = Conjunto.contains(dato); // si el elemento esta da un positivo, sino un negativo
        
        if(posicion == true){
            System.out.println("El elemento '" + dato + "' ya está en la lista, no hay necesidad de agregarlo");  
        } else{
            Conjunto.add(dato);
        }
    }
    public void eliminarDato(T dato){
        Conjunto.remove(dato);
    }
  public boolean Igual(HashSet<T> oc){
      if (Conjunto.equals(oc)){
          System.out.println(" Conjuntos iguales");
      }else {
          
          System.out.println("Conjuntos diferentes");
      }
      return Conjunto.equals(oc);
  }
  
public boolean SubConjunto(HashSet<T> oc){
    if(Conjunto.containsAll(oc)){
        System.out.print("oc + Si es sub :" + Conjunto);
    }else{
        System.out.print(oc + "No es sub :" + Conjunto);
    }
    boolean isSubset =Conjunto.containsAll(oc);
    return isSubset;
    }
public void union (HashSet<T> oc){
    HashSet<T> union = new HashSet();
    T datoUno;
    T datoDos;
    Iterator<T> x=Conjunto.iterator(); //salta elementos del primer conjunto
    Iterator <T> y=oc.iterator(); // salta elementos del segundo conjunto
    
    while(x.hasNext()){
        datoUno=x.next();
        
        if(!union.contains(datoUno)){
            union.add(datoUno);
        }
        while(y.hasNext()){
            datoDos=y.next();
            
            if(!union.contains(datoDos)){
               union.add(datoDos);
            }
        }
    }
    System.out.print(" Union de los conjuntos: " + union); 
}
public void interseccion (HashSet <T> oc){
    HashSet<T> inte =new HashSet();
    T datoUno;
    T datoDos;
    Iterator<T> x= Conjunto.iterator(); //salta elementos del primer conjunto
    Iterator<T> y= oc.iterator(); //salta elementos del segundo conjunto 
    
    while (x.hasNext()){
        datoUno= x.next();
        
     while(y.hasNext()){
         datoDos= y.next();
         
         if(datoUno.equals(datoDos)){
             inte.add(datoUno);
         }
     }
     y=oc.iterator();
    }
    System.out.print("Su interseccion da:" + inte);
}
public void diferencia(HashSet<T> oc){
    HashSet<T> difer =new HashSet();
    T dato;
    Iterator<T> x =Conjunto .iterator();
    
    while(x.hasNext()){
        dato= x.next();
        if (!oc.contains(dato)){
            difer.add(dato);
        }
    }
    System.out.print("Su difernecia da:" +difer);
}
public void iterador(){
    Iterator valor= Conjunto.iterator();
    
    System.out.print("El conjunto iterado es:\n");
    while(valor.hasNext()){
        System.out.print(valor.next());
    }
    
}
@Override 
        public String toString (){
            return "ConjuntoADT{"+ Conjunto+ '}';
        }
}