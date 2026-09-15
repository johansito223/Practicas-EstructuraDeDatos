#include <iostream>

void SelectionSort(int a[], int tam){
    for (int i = 0; i < tam ; i++){
        int small = i;
        for (int j = i + 1; j< tam; j++){
            if (a[small] > a[j]){
                small = j;
            }
        }
        std::swap(a[i], a[small]);
    }
}

void PrintArr(int a[], int tam){
    for (int i = 0; i < tam; i++) {
        std::cout << a[i] << " ";
    }
    std::cout << "\n";   
}

int main(){
    int a[] = {65, 26, 13, 23, 12};
    int tam = sizeof(a)/sizeof(a[0]);
    std::cout<<"Elemtnos del arreglo antes de ordenarlo\n";
    PrintArr(a, tam);
    SelectionSort(a, tam);
    std::cout<<"Elemtnos del arreglo despues del ordenamiento\n";
    PrintArr(a, tam);

    return 0;
}