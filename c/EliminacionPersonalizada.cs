using System;

class program
{
   static void Main(string[] args)
   {
      int [] numeros = {11, 21, 31, 41 ,51};
      Console.WriteLine("Antes de la eliminacion, el arreglo es: ");
      Console.WriteLine(string.Join(", ", numeros));

        int[] nuevoArreglo = new int[numeros.Length - 1];
        int posicionAEliminar = 2; // Por ejemplo, eliminar el elemento en la posición 2 (31)
        int index = 0;
        for (int i = 0; i < numeros.Length; i++)
        {
            if (i != (posicionAEliminar - 1)) // Ajustamos la posición a eliminar para que sea 0-indexed
            {
                nuevoArreglo[index] = numeros[i];
                index++;
            }
        }
        Console.WriteLine("Después de la eliminación, el arreglo es: ");
        Console.WriteLine(string.Join(", ", nuevoArreglo));
   }
}

