import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[] a){
        for (int i = 0; i < a.length; i++){
            int small = i;
            for (int j = i+1; j<a.length; j++ ){
                if (a[small] > a[j]){
                    small = j;
                }
            }
            int temp = a[i];
            a[i] = a[small];
            a[small]  = temp;
        }
    }
    public static void PrintArr(int [] a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args){
        int [] a = {65, 26, 13, 23, 12};
        System.out.println("Arreglo antes de los cambios:");
        PrintArr(a);
        selectionsort(a);
        System.out.println("Arreglo despues de los cambios:");
        PrintArr(a);
    }
}
