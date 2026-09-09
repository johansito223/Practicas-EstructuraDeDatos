using System;

class program
{

    static int FindEl(int[] arr, int l, int h, int target)
    {
        while (l <= h)
        {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }
        }
        return -1; // solo si el elemento no se encuentra en el arreglo
    }
    static void Main(string[] args)
    {
       int [] lista = {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
       int target = 40;
       int s = lista.Length;

       int idx = FindEl(lista, 0, s - 1, target);
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