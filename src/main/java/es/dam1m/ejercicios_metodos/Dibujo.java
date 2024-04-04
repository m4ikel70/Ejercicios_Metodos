package es.dam1m.ejercicios_metodos;

/**
 *
 * @author b08-21m
 */
public class Dibujo {
    public static void pintaLinea(int num, char simbolo){
        for (int i = 0; i<num;i++){
            System.out.print(simbolo);           
        }
    }
    public static void pintaCuadrado(int altura,  char simbolo){
       int cont = 0;
        while (cont < altura){
           pintaLinea(altura, simbolo);
            System.out.println("");
            cont++;
       }
    }
        public static void pintaPiramide(int altura,  char simbolo){
            int cont = 0;
            int num = 1;
            int espacio= altura-1;
            while (cont<altura){
                pintaLinea(espacio,' ');
                pintaLinea(num, simbolo);
                System.out.println("");
               num= num + 2;
               espacio--;
                cont++;
                
            }
        }
        public static void pintaRevesPiramide(int altura,  char simbolo){
            int cont= 0;
            int espacio = 1;
            int num = altura-1;
            while(cont < altura){
                pintaLinea(num,'*');
                System.out.println("");
                pintaLinea(espacio,' ');
                espacio++;
                cont++;
            }
        }
        }


