using System;

class program
{
    static void Main(string[] args)
    {
        int [] numeros = { 10,20,30,40,50 };
        int [] nuevo = new int[numeros.Length + 1];

        int posicion = numeros.Length; // Posicion donde se quiere insertar el nuevo valor
        int valor = 25; // Valor a insertar

        //primero se muestra como era el arreglo antes de la insercion, luego se recorre el arreglo original hasta la posicion donde se quiere insertar el nuevo valor, se asigna el nuevo valor en esa posicion y luego se recorre el resto del arreglo original para asignar los valores al nuevo arreglo
        Console.WriteLine("Antes de insertar asi se ve el arreglo: ");
        Console.WriteLine(string.Join(", ", numeros));

        for (int j = 0; j < posicion; j++)
        {
            nuevo[j] = numeros[j];
        }
        nuevo[posicion] = valor;
        for (int j = posicion + 1; j < nuevo.Length; j++)
        {
            nuevo[j] = numeros[j - 1];
        }
        Console.WriteLine("Despues de insertar asi se ve el arreglo: ");
        Console.WriteLine(string.Join(", ", nuevo));
    }
}