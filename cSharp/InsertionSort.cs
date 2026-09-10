using System;

class program
{
    
    static void InsertionSort(int[] a)
    {
        for(int j = 1; j < a.Length; j++)
        {
            int temp = a[j];

            int i = (j - 1);

            while (i >= 0 && temp < a[i])
            {
                a[i + 1] = a[i];
                i--;

            }
            a[i + 1] =  temp;
        }
    }
    static void PrintArr(int[] a)
    {
        Console.WriteLine(string.Join(" ", a));
    }

    static void Main(String[] args)
    {
        int[] a = {70, 15, 2, 51, 60};
        Console.WriteLine("Elementos del arreglo antes de ordenarlos: ");
        PrintArr(a);
        InsertionSort(a);
        Console.WriteLine("Elementos del arreglo despues de ordenarlos: ");
        PrintArr(a);
    }
}