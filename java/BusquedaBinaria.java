

public class BusquedaBinaria {
    public static int FindElement(int[] arr, int l, int h, int targetvalue ){
        while (l <= h){
            int mid =  l + (h-l) / 2;
            if (arr[mid] == targetvalue) {
                return mid;
            } else if (arr[mid] < targetvalue){
                l = (mid + 1);
            }else{
                h = (mid - 1);

            }


        }
    return -1;

    
}
//esta parte es la que realiza la busqueda binaria de un numero en un arreglo, para esto se utiliza un ciclo while que se ejecuta mientras el limite inferior sea menor o igual al limite superior, dentro del ciclo se calcula el indice medio del arreglo y se compara con el numero a buscar, si es igual se retorna el indice, si es menor se actualiza el limite inferior y si es mayor se actualiza el limite superior
    public static void main(String[] args) {
        int [] numeros = {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
        int targetElement = 40;  
        int s =(numeros.length);

        int idx = FindElement(numeros, 0, (s-1), targetElement);

        if (idx != -1){
            System.out.println("El elemento se encuentra en la posicion: " + (idx + 1));
        } else{
            System.out.println("No se encontro el numero");
        }


    }


}
