package es.dam1m.ejercicios_metodos;
 
import java.io.File; 
 
public class FUtil { 
  
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
