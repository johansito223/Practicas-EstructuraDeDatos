#include <iostream>

void InsertionSort(int a[], int tam){
    for (int j = 1; j<tam; j++){
        int temp = a[j];
        int i = (j - 1);

        while (i >= 0 && temp < a[i]){
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] =temp;
    }
}

void PrintArr(int a[], int tam){
    for (int i = 0; i < tam; i++) {
        std::cout << a[i] << " ";
    }
    std::cout << "\n";
}

int main(){
    int a[] = {70, 15, 2,51, 60};
    int tam =  sizeof(a)/sizeof(a[0]);
    std::cout<<"Elementos del arreglo antes de cambiarlos: ";
    PrintArr(a, tam);
    InsertionSort(a, tam);
    std::cout<<"Elementos del arreglo despues de cambiarlos: ";
    PrintArr(a, tam);

    return 0;
}