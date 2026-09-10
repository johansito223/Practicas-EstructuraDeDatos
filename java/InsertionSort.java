import java.util.Arrays;

public class InsertionSort {
    public static void Insertionsort(int[] a){
        for (int i = 1; i<a.length; i++){
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]){
                a[j + 1] = a[j];
                j--;
            }
        a[j + 1] = temp;
        }

    }
    public static void PrintArr(int[] a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args){
        int [] a = {70, 15, 21, 2, 51, 60};
        System.out.println("Elementos antes del ordenamiento: ");
        PrintArr(a);
        Insertionsort(a);
        System.out.println("Elementos despues del ordenamiento: ");
        PrintArr(a);
    }

}
