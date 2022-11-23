/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colaedd.colasprioaco;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
/**
 *
 * @author IngridAmayranee
 */
public class ColasPrioAco {

    public static void main(String[] args) {
   PriorityQueue cp = new PriorityQueue();
        
   cp.add(6);
     cp.add(3);
       cp.add(9);
        cp.add(1);
        
        
  System.out.println(cp);
  
  int eleccion = 0,nodoDatos = 0;
  MetodoCola cola = new MetodoCola();
  do {            
    try {
    eleccion =  Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de la Cola PrioAco\n"
    + "1. Mete un dato para el nodo \n"
        + "2. Saca un nodo \n"
            + "3. Muestra en la pantalla todo el nodo \n"
                + "4. Bye \n"));
              
              
              
switch (eleccion) {
   case 1: nodoDatos = Integer.parseInt(JOptionPane.showInputDialog(null,"---Oye este es un nodo con un valor de prioridad--"));
        cola.aniadir(eleccion, nodoDatos);
                        
   case 2: if(!cola.Sacar()){
           JOptionPane.showInputDialog(null,"-----Oye se saco un valor-----:  "+cola.Sacar());
                        
}else{
JOptionPane.showMessageDialog(null,"-----Esta cola esta vacia ,por lo tanto no se puede devolver ningun valor-----");
    } break;
                                        
    case 3:cola.EnseniaDatos();
        break;
                                     
   case 4:eleccion  = 4 ;
   break;
   default:JOptionPane.showInputDialog(null,"-----Esta  opcion no esta disponible, saludos-----");
        }
     } catch (NumberFormatException e) {
   }
 } while (eleccion !=4);
    }  
}


