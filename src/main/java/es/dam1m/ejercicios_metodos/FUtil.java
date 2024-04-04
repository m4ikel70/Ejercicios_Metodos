package es.dam1m.ejercicios_metodos;
 
import java.io.File; 
 
public class FUtil { 
  
	 public static boolean existe(String filename) { 	 
                            File file = new File(filename); 
 
                        if (file.exists()) {
                            return true; 
	      }  
                return false; 
 } 
} 
