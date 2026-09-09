
using System;

class program
{
    static void Main(string[] args)
    {
        int [] numeros = { 11, 21, 31, 41,51 };
        Console.WriteLine("Antes de la eliminacion, el arreglo es: ");
        Console.WriteLine(string.Join(", ", numeros));

        int [] nuevo = new int[numeros.Length - 1];

        for (int j = 0; j < numeros.Length - 1; j++)
        {
            nuevo[j] = numeros[j + 1];
        }

        Console.WriteLine("Despues de la eliminacion, el arreglo es: ");
        Console.WriteLine(string.Join(", ", nuevo));
    }
}