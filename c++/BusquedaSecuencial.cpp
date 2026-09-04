#include <iostream>

int FindSec(int arr[],int tam, int target) {
    for (int i = 0; i < tam; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

int main (){
    int numeros [] {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
    int target = 40;
    int tam = sizeof(numeros) / sizeof(numeros[0]);
    int idx = FindSec(numeros, tam, target);
    if (idx != -1) {   
        std::cout << "Elemento encontrado en el indice: " << idx + 1 << std::endl;
    } else {
        std::cout << "Elemento no encontrado" << std::endl;
    }

    return 0;
}
