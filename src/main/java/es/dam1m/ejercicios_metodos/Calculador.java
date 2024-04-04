package es.dam1m.ejercicios_metodos;

public class Calculador {
    
    public static int redondea (double num){
        
            int parte_entera = (int)num;
                double redondeo = num-parte_entera;
                if (redondeo >= 0.5) {
                    parte_entera++;
                }
                return parte_entera;
      }
    public static int potencia(int base, int exponente){
            int cont = 0;
            int resultado = 1;
        while (cont<exponente){
          resultado = base*resultado;
                  cont++;
                  
      }
        return resultado;
        
    }
    
    public static int cuentaCifras(int num){
        
        int cifra = 1;
        
        while (num>0){
            num = num/10;    
            if (num>0){
                cifra++;
            }
            }
        return cifra;
    }
}
