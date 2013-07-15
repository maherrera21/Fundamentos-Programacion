/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class EjerciciosClase3 {

    public static void main(String[] args) {
// Variables
        Scanner leer = new Scanner(System.in);
        double pie = 0.0;
        double yardas = 0.0;
        double centimetros = 0.0;
        double metros = 0.0;
        double pulgadas = 0.0;
// Solicitamos y leemos el valor en pies
        System.out.println ("Ingrese el valor en Pies, para convertir");
        pie = leer.nextInt();
// Convertimos
        yardas = pie / 3;
        pulgadas = pie * 12;
        centimetros = pie * 12 * 2.54;
        metros = (pie * 12 * 2.54) / 100;
// Imprimimos
        System.out.printf( "La conversion de " + pie
                + " pies, en yardas es: " + yardas + ", en pulgadas: "
                + pulgadas + ", en centimetros: " + centimetros
                + " y en metros: " + metros);
    }// Fin metodo
}
