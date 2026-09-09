using System; 

class program
{
    static void Main(string[] args)
    {
      int [] numeros = { 1, 2, 3, 4, 5,};
      string ola = "";
      for (int j = 0; j < numeros.Length; j++)
      {
        ola +=numeros[j] + " ";
      }
      Console.WriteLine(ola);
    }
}