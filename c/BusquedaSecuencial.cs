using System;

class program
{
    static int FindSec(int [] arr, int target)
    {
        for (int j = 0; j < arr.Length; j++)
        {
            if (arr[j] == target)
            {
                return j;
            }
        }
        return -1; // solo si no se encuentra el elemento
    }
    static void Main(string[] args)
    {
        int [] lista = {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
        int target = 89;
        int idx = FindSec(lista, target );
        if (idx != -1)
        {
            Console.WriteLine($"Elemento encontrado en el índice: {idx + 1}");
        }
        else
        {
            Console.WriteLine("Elemento no encontrado en la lista.");
        }
    }
}