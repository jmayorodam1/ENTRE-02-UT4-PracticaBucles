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
        double media = 0;
        double sumaImpares = 0;
        double maxPares = Integer.MIN_VALUE;
        int aleatorio = 1;
        int fila = 0;
        System.out.println("Nº maximo de aleatorios a generar " + n + "\no hasta que salga el 0\n");
        while(i <= n && aleatorio !=0){

            aleatorio = generador.nextInt(51001) -1000; 
            if(fila == 5){
                System.out.println();
                fila = 0;
            }
            fila++;
            System.out.print(String.format(" %12d:  %5d",aleatorio,obtenerNumeroSinCeros(aleatorio)));
            i++;
            media += aleatorio;
            if(maxPares < aleatorio && aleatorio % 2 == 0){
                maxPares = aleatorio;
            }
            if(aleatorio % 2 != 0){
                sumaImpares += aleatorio;
            }

        }
        System.out.println();
        media /= i;
        System.out.printf("\n%25s Media: %10.2f","",media);
        System.out.printf("\n%25s Suma impares: %10.2f", "",sumaImpares);
        System.out.printf("\n%25s Maximo pares: %10.2f", "",maxPares);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        if(numero % 2 != 0){
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
        while(numero != 0){
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
        String str = "";
        for(int fila = 1; fila <= altura; fila++){
            escribirCaracter(CARACTER,1);
            for(int col = 1; col <= altura; col++){
                escribirCaracter(ESPACIO,fila);
                escribirCaracter(CARACTER,1);
                escribirCaracter(ESPACIO,altura-fila);
                escribirCaracter(CARACTER,1);
                col += altura;                    
            }
            System.out.println();
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int i = 1; i <= n; i++){

            System.out.print(caracter);

        }

    }
}
