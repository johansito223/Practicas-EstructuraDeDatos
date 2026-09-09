using System;

class Program
{
    
    static int BubbleSort(int[] a)
    {
        int s = a.Length;
        for (int j = 0; j < s; j++)
        {
            bool isSwapped = false;
        
            for (int i = 0; i < s - 1; i++)
            {
                if  (a[i] > a[i + 1])
                {
                    int x = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = x;
                    isSwapped = true;

                }
            }
            if (!isSwapped)
            {
                break;
            }
        }
        return 0;
    }

    static void Main(string[] args)
    {
        int [] a = {15, 16, 11, 13, 14};
        Console.WriteLine("Los elementos antes de ordenarlos: ");
        for (int i = 0; i < a.Length; i++)
        {
            Console.Write(a[i] + " ");
        }
        Console.WriteLine();
        BubbleSort(a);
        Console.WriteLine("Los elementos después de ordenarlos: ");
        for (int i = 0; i < a.Length; i++)
        {
            Console.Write(a[i] + " ");
        }
        Console.WriteLine();
    }
}