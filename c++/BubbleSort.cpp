#include <iostream>

void BubbleSort(int a[], int s) {
    for (int j = 0; j < s; j++) {
        bool isSwapped = false;
        for (int i = 0; i < s - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                isSwapped = true;
            }
        }
        if (!isSwapped) {
            break;
        }
    }
}

int main() {
    int a[5] = { 15, 16, 11, 13, 14 };
    int n = 5;

    std::cout << "Antes de ordenar los elementos en el arreglo: ";
    for (int i = 0; i < n; i++) std::cout << a[i] << " ";
    std::cout << std::endl;

    BubbleSort(a, n);

    std::cout << "Después de ordenar los elementos en el arreglo: ";
    for (int i = 0; i < n; i++) std::cout << a[i] << " ";
    std::cout << std::endl;

    return 0;
}