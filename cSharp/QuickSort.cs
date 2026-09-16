using System;
using System.Drawing;


class program
{
    static int partition(int [] a, int l , int h)
    {
        int pvt = a[h];
        int j = l - 1;
        for (int k = l; k < h; k++)
        {
            if (a[k] < pvt)
            {
                j+= 1;
                swap(a, j, k);
            }
        }
        swap(a, j + 1, h);
        return j + 1;
    }

    static void swap(int []a, int j, int k)
    {
        (a[j], a[k]) = (a[k], a[j]);
    }

    static void qcksort(int []a, int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, h);
            qcksort(a,l, pi -1 );
            qcksort(a, pi + 1, h);
        }
    }

    static void Main(String[] args)
    {
        int [] a = { 10, 7, 8 ,9, 1, 5};
        int size = a.Length;
        Console.WriteLine("Elementos antes de ordenarlos:");
        Console.WriteLine(string.Join(" ", a));
        qcksort(a, 0, size - 1);
        Console.WriteLine("Elementos despues de ordenarlos:");
        Console.WriteLine(string.Join(" ", a));
    }
}