public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {15, 16, 11, 13, 14};
        System.out.println("Arreglo original:");
        for (int num : a) {
            System.out.print(num + " " );
        }
        System.out.println();
        bubbleSort(a);
        System.out.println("Arreglo ordenado:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
