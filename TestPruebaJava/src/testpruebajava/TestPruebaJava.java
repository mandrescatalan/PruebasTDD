package testpruebajava;
import java.util.Scanner;
/**
 *
 * @author michael
 */
public class TestPruebaJava {

    
    public static void main(String[] args) {
        
       Fibonacci fibonacci = new Fibonacci();
       
       Scanner lectura = new Scanner (System.in);
       System.out.println("Ingrese el número de numeros de Fibonacci que desea mostrar:");
       int limite = lectura.nextInt();
       System.out.println();
       fibonacci.serieFibonacci(limite);
    }
    
}
