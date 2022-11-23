/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaedd.colasprioaco;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author IngridAmayranee
 */
public class MetodoCola {
 private Nod inColas,finColas;
    String Colas = "      ";
    PriorityQueue<Object> pr = new PriorityQueue<>();
    public MetodoCola() {
    inColas = null;
    finColas = null;
            
    
    }
    public boolean estaVacia(){
        return inColas==null;
    }
    public void aniadir(int PriorityQueue ,int datos){
        Nod nwNodo = new Nod();
        nwNodo.prio = PriorityQueue;
        nwNodo.datos = datos;
        nwNodo.siguiente =null;
        
        if(estaVacia()){
           inColas = nwNodo; 
           finColas = nwNodo;
        }else{
            finColas.siguiente= nwNodo;
            finColas = nwNodo;
        }
    }
    
    public int Sacar(int PriorityQueue ){
     if(!estaVacia()){
            int dato = inColas.prio;
            if(inColas == finColas){
                inColas = null;
                finColas= null;
            
        }else{
            inColas = inColas.siguiente;
        }return  dato;
        }else{
              return Integer.MAX_VALUE;  
                }
    }   
    
public void EnseniaDatos(){
        Nod repaso = inColas;
        String ColaImp = "     ";
        while(repaso!=null){
            Colas += repaso.datos + "     ";
            repaso = repaso.siguiente;
            
        }
        //Separar la cadena
        String Lazo[]=Colas.split("       ");
    for(int i = Lazo.length -1;i>=0; i--){
        ColaImp += "    " + Lazo[i];
        
    }
        JOptionPane.showMessageDialog(null,ColaImp);
       Colas = "     ";
    
    }

    boolean Sacar() {
        throw new UnsupportedOperationException("-----No es valido-----"); 
    }
}
 
