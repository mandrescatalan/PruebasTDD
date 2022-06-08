using PruebaFibonacci;

Fibonacci fibonacci = new Fibonacci();

Console.WriteLine("Ingrese el número de numeros de Fibonacci que desea mostrar");
int limite = int.Parse(Console.ReadLine()!);

fibonacci.serieFibonacci(limite);
