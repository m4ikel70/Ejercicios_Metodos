package es.dam1m.ejercicios_metodos;
 
import java.io.File; 
 
public class FUtil { 
          
    /**
     * Comprueba si un archivo existe mediante un parametro.
     * @param filename el nombre del archivo que se quiere comprobar
     * @return true si el archivo existe, false si no existe
     * @throws IllegalArgumentException si la cadena está vacía o contiene espacios en blanco
     */
    	 public static boolean existe(String filename) { 
            if (filename == null || filename.trim().isEmpty()) {
                throw new IllegalArgumentException
                ("El nombre introducido esta en blanco "
                + "o tiene espacios en blanco.");
             }
                            File file = new File(filename); 
 
                        if (file.exists()) {
                            return true; 
	      }  
                return false; 
 } 
} 
