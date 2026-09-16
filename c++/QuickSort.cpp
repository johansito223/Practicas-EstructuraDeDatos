#include <iostream>

void swap(int a [] , int j, int k){
    int temp = a[j];
    a[j] = a[k];
    a[k] = temp;
}

int partition(int a[], int l, int h){
    int pvt = a[h];
    int j = l - 1;
    for (int k = l; k < h; k++){
        if (a[k] < pvt ){
            j+=1;
            swap(a, j, k);
        }
    }
    swap(a, j + 1, h);
    return j + 1;
}


void qcksort (int a[], int l, int h ){
    if (l < h){
    int pi = partition(a, l, h);
    qcksort(a, l, pi - 1);
    qcksort(a, pi + 1, h);
    }

}

int main(){
    int a[] = {10, 7, 8, 9, 1, 5};
    int tam = sizeof(a)/sizeof(a[0]);
    std::cout<<"Arreglo antes de ordenarlos:\n";
    for (int i = 0; i < tam; i++) {
        std::cout << a[i] << " ";
    }
    std::cout << "\n";
    qcksort(a, 0, tam - 1);
    std::cout<<"Arreglo despues de ordenarlos:\n";
    for (int i = 0; i < tam; i++) {
        std::cout << a[i] << " ";
    }
    std::cout << "\n";
    return 0;
}