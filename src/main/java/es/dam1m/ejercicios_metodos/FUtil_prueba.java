package es.dam1m.ejercicios_metodos;

public class FUtil_prueba {

    public static void main(String[] args) {
        String verdadero = "Hola_mundo.txt";
        
        boolean existe1 = FUtil.existe("Calculador");
        System.out.println(existe1);
        boolean existe2 = FUtil.existe(verdadero);
        System.out.println(existe2);
    }

}
