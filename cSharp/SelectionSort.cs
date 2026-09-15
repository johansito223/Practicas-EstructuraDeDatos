using System;


class program
{
    
    static void SelectionSort(int [] a)
    {
        for (int i = 0; i < a.Length; i++)
        {
            int small = i;

            for (int j = i+1; j < a.Length; j++)
            {
                if (a[small] > a[j])
                {
                    small = j;
                }
            }
            (a[i], a[small]) = (a[small], a[i]);
        }
    }

    static void PrintArr(int [] a)
    {
        Console.WriteLine(string.Join(" ", a));
    }

    static void Main(String[] args)
    {
        int[] a = {65, 26, 13, 23, 12};
        Console.WriteLine("Elementos del arreglo antes de ordenarlos: ");
        PrintArr(a);
        SelectionSort(a);
        Console.WriteLine("Elementos del arreglo despues de ordenarlos:");
        PrintArr(a);
    }
}