using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PruebaFibonacci
{
    public class Fibonacci
    {
        public bool serieFibonacci(int? limite)
        {

            
            if (limite == null || limite<=0 || limite>100 )
            {
                return false;
            }

           
            int a, b, i, auxiliar;
            a = 0;
            b = 1;

            for (i = 0; i < limite; i++)
            {
                auxiliar = a;
                a = b;
                b = auxiliar + a;
                Console.WriteLine(a);
            }

            return true;
        }
    }
}
