

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
