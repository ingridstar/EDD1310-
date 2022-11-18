/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package balanceoparentesis;
import codigolectura.lectura;
import pilasadt.PilasADT;
/**
 *
 * @author IngridAmayranee
 */
public class Balanceo {

    public static void main(String[] args) {
          //Balanceo txtUno
        lectura Uno = new lectura();

        System.out.println("-----texto1-----");
        String txt = Uno.leer("C:\\Users\\IngridAmayranee\\Documents\\NetBeansProjects\\Balanceo\\src\\main\\java\\recursos");

        PilasADT<Character> pi = new <Character>PilasADT();

        String entrada = txt;

        int iUno = 0;
        int tamanio = entrada.length();

        while (iUno < tamanio) {
            if (entrada.charAt(iUno) == '(') {
                pi.push(')');
            } else {
                if (pi.isEmpty()) {
                    break;
                } else {
                    pi.pop();
                }
            }
            iUno++;
        }

        if (pi.isEmpty() && iUno == tamanio) {
            System.out.println("Este balanceo es correcto");
        } else {
            System.out.println("Este balanceo es incorrecto");
        }

        //Balanceo del segundo txt
        lectura l2 = new lectura();

        System.out.println("----------------Texto2----------------");
        String txt2 = l2.leer("C:\\Users\\IngridAmayranee\\Documents\\NetBeansProjects\\Balanceo\\src\\main\\java\\recursos");

        PilasADT<Character> p2 = new <Character>PilasADT();

        String entrada2 = txt2;

        int iDos = 0;
        int tamanioDos = entrada2.length();

        while (iDos < tamanioDos) {
            if (entrada2.charAt(iDos) == '(') {
                pi.push('(');
            } else {
                if (p2.isEmpty()) {
                    break;
                } else {
                    p2.pop();
                }
            }
            iDos++;
        }

        if (p2.isEmpty() && iDos == tamanioDos) {
            System.out.println("Este balanceo es correcto");
        } else {
            System.out.println("Este balanceo es incorrecto");
        }

    }

}
  
