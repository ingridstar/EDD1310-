/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pilasadt;
import java.util.ArrayList;
/**
 *
 * @author IngridAmayranee
 *
 */
public class PilasADT<T> {
    int tamanio;
    ArrayList<T> vPila = new ArrayList<>();
    int tope = 0;

    public PilasADT() {
    }
    public boolean isEmpty(){
        return this.vPila==null;
    }
    
    public int length(){
        return this.tamanio;
    }
    
    public T pop(){
        T eliminar = null;
        if(isEmpty()){
            System.out.println("No sirve este método, la pila se encuentra vacía.");
        }else{
            eliminar = vPila.remove(tope-1);
            
            this.tope--;
            this.tamanio--;
        }
        
        return eliminar;   
    }
    
    public T peek(){
        T revisar= null;
        if(isEmpty()==true){
            System.out.println("No sirve este método, la pila está vacía.");
        }else{
            revisar = vPila.get(tope-1);
        }
        
        return revisar;   
    }
    
    public void push(T dato){
        vPila.add(tope, dato);
        
        this.tope++;
        this.tamanio++;
    }

    @Override
    public String toString() {
        return "Pila{"+vPila+"}";
    }
    
}
    