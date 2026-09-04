public class BusquedaSecuencial {
    public static int FindElement(int[] arr,int targetvalue ){
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == targetvalue)
            {
                return j;
            }
        }
    return -1;
    }


 public static void main(String[] args) {
        int [] numeros = {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
        int targetvalue = 40;  

        int idx = FindElement(numeros, targetvalue);

        if (idx != -1){
            System.out.println("El elemento se encuentra en la posicion: " + (idx + 1));
        } else{
            System.out.println("No se encontro el numero");
        }


    }


}