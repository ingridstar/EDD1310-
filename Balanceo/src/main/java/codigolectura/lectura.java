/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigolectura;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author IngridAmayranee
 */
public class lectura {
    String entrada;
    private BufferedReader lectura;
    private String almcen;

    public lectura() {
    }
    
    
    public String leer(String nombreArchivo){
        try {
            lectura = new BufferedReader(new FileReader(nombreArchivo));
            String pv = "";
            while((entrada = lectura.readLine()) != null){
                pv = pv + entrada;
                
            }
            
            almcen = pv;
            
            System.out.println(almcen);
            
            lectura.close();
            
            
        } catch (Exception e) {
            System.out.println("No se establecer la lectura");
        }
        return almcen;
    }
}

