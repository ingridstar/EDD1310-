/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaedd.colas;

import javax.swing.JOptionPane;
/**
 *
 * @author IngridAmayranee
 */
public class Instrucciones {

    public static void main(String[] args) {
      
    int  opcion= 0,nodo_datos = 0;
        
    Colas colas = new Colas();
        
    do {            
       try {
         opcion =   Integer.parseInt(JOptionPane.showInputDialog(null,"Pasos de Cola\n"
                      + "-----Introduce un nodo-------"
                      + "-----Saca un nodo--------"
                      + "-----Ensenia el contenido del nodo-----"
                      + "--------BYE :)---------"));
              
              
              
        switch (opcion) {
                case 1:
                    nodo_datos = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un valor para guardarlo "));
                        colas.AniadirFin(nodo_datos);
                        break;
                        
                case 2:
                        if(!colas.EstaVacia()){
                             JOptionPane.showInputDialog(null,"Oye se extrajo un valor:  "+colas.SacarElemento());
                        
                        }else{
                            JOptionPane.showMessageDialog(null, "Esta cola esta vacia ,por lo tanto no se puede devolver un valor ");
                        }
                        break;
                        
                        
                case 3:
                        colas.EnseniaDatos();
                        break;
                
                case 4:
                        opcion  = 4 ;
                        break;
                    default:
                        
                        
         JOptionPane.showInputDialog(null,"No esta disponible");
                }
            } catch (NumberFormatException e) {
          }
       } while (opcion !=4);
    } 
}

