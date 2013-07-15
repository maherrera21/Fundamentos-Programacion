/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase;

import java.util.Scanner;

/**
 *
 * @author MIGUELH
 */
public class EjerciciosClase4 {

    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.println("Ingrese la cadena da caracteres ");
        String valor = cadena.next();
        
        if (valor.length() > 10) {
            
            if (valor.length() < 15) {

                char primerCaracter = pirmerCaracter(valor);
                String valorEnMayuscula = convertirMayusculas(valor);
                int tamañoValor = tamañoCadena(valor);
                System.out.println(primerCaracter);
                System.out.println(valorEnMayuscula);
                System.out.println(tamañoValor);
            } else {
                System.out.println("El tamano del caracter no es mayor a 10");
            }
        }
    }

    public static char pirmerCaracter(String cadena) {

        return cadena.charAt(1);
    }

    public static String convertirMayusculas(String numero) {
        return numero.toUpperCase();
    }

    public static int tamañoCadena(String numero) {
        return numero.length();
    }
}
