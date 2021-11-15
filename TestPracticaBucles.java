import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *   @author- Javier Mayor 
 */
public class TestPracticaBucles
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);

        PracticaBucles practica = new PracticaBucles();

        System.out.println("Dame nº maximo de aleatorios a generar (n > 0): ");

        int numero = teclado.nextInt();

        while(numero <= 0){
            System.out.println("Dame nº maximo de aleatorios a generar (n > 0): ");

            numero = teclado.nextInt();
        }
        
        practica.generarNumeros(numero);
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.println("Teclea altura de la letra N(3 <= altura <= 10):");

        int n = teclado.nextInt();

        while(n < 3 || n > 10){
            System.out.println("Altura incorrecta, Teclea altura de la letra N(3 <= altura <= 10):");

            n = teclado.nextInt();
        }
        
        practica.escribirLetraN(n);
    }
}

