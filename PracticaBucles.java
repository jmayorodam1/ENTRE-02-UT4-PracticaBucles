import java.util.Random;
/**
 *   @author- Javier Mayor 
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
       int i = 1;
       int media = 0;
       int suma = 0;
       int maxPares = Integer.MIN_VALUE;
       int aleatorio = 1;
       while(i <= n || aleatorio !=0){
           aleatorio = generador.nextInt(51001) -1000; 
           int fila = 1;
        while (fila <= 5) {             
            int col = 1;
            while (col <= i)   {
                System.out.print(String.format("%2d", fila));
                col++;
            }
            System.out.println();
            fila++;
        }
        i++;
        }

    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        if(numero % 2 == 0){
            return true;
        }
        return  false;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int num = 0;
        int i = 0;
        while(numero > 0){
            if(numero % 10 != 0){
                num += numero % 10 * Math.pow(10,i);
                i++;
            }
            numero = numero / 10;
            
        }
        
        
        return num;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
       //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
       //TODO
       
       
       
       
    }

}
