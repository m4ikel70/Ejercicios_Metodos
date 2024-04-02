/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.dam1m.ejercicios_metodos;

/**
 *
 * @author b08-21m
 */
public class Ejercicios_Metodos {

    public static void main(String[] args) {
        int redondeo = Calculador.redondea(5.4);
        System.out.println(redondeo);
        
        int potencia = Calculador.potencia(2, 3);
        System.out.println(potencia);
        
        int cifra = Calculador.cuentaCifras(14134);
        System.out.println(cifra);
        
        Dibujo.pintaLinea(5, '*');
        System.out.println("");
        Dibujo.pintaCuadrado(4,'*');
        System.out.println("");
        Dibujo.pintaPiramide(10, '*');
        System.out.println("");
        Dibujo.pintaRevesPiramide(5, '*');
    }
}
