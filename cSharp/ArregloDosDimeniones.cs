using System;
    class Program
    {
        static void Main(string[] args)
        {
            int [][] numeros = [
                [1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]
            ];
            for (int i = 0; i < numeros.Length; i++)
            {
                for (int j = 0; j < numeros[i].Length; j++)
                {
                    Console.Write(numeros[i][j] + " ");
                }
                Console.WriteLine();
            }
        }

    }