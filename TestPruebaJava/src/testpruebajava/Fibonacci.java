package testpruebajava;

/**
 *
 * @author michael
 */
public class Fibonacci {

    public boolean serieFibonacci(int limite) {

        if (limite <= 0 || limite > 100) {
            return false;
        }
       
        int a, b, i, auxiliar;
        a = 0;
        b = 1;

        for (i = 0; i < limite; i++) {
            auxiliar = a;
            a = b;
            b = auxiliar + a;
            System.out.println(a);
        }
        return true;
      
    }
}
