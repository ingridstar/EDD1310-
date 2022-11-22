/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colaedd.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author IngridAmayranee
 */
public class Colas {
      private Nod inColas,finColas;
    String Colas = "";

    public Colas() {
        inColas = null;
        finColas = null;
    }
    public boolean EstaVacia (){
        return inColas == null;
    } 
    public void AniadirFin(int datos){
        Nod nwNodo = new  Nod();
        nwNodo.datos= datos;
        nwNodo.siguiente = null;
        
        
        if(EstaVacia()){
           inColas = nwNodo; 
           finColas = nwNodo;
        }else{
            finColas.siguiente= nwNodo;
            finColas = nwNodo;
        }
    }
    public int SacarElemento(){
        if(!EstaVacia()){
            int dat = inColas.datos;
            if(inColas == finColas){
                inColas = null;
                finColas= null;
            
        }else{
            inColas = inColas.siguiente;
        }return  dat;
        }else{
              return Integer.MAX_VALUE;  
                }
    }
    public void EnseniaDatos(){
        Nod repaso = inColas;
        String ColaMost = "";
        while(repaso!=null){
            Colas += repaso.datos + " ";
            repaso = repaso.siguiente;
            
        }
        //Separar cadena
        String Cadena[]=Colas.split(" ");
    for(int i = Cadena.length -1;i>=0; i--){
        ColaMost += "  " + Cadena[i];
        
    }
        JOptionPane.showConfirmDialog(null,ColaMost);
       Colas = "";
    
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

