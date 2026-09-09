#include <iostream>

int FindEle(int arr[], int l , int h , int targetvalue ){
    //esta funcion busca un elemento en un arreglo de manera binaria, es decir, divide el arreglo en dos partes y busca en la parte que corresponde al valor buscado
    while (l <= h) {
        int mid = (l + (h - l) / 2);

        if (arr[mid] == targetvalue){
            return mid;
        }else if (arr[mid]< targetvalue){
            l = (mid + 1);
        } else{
            h = (mid - 1);

        }

    }
return -1;
}

int main (){
	int list[] = {6, 10, 12, 19, 34, 40, 57, 69, 89, 98};
	int targetvalue =  40;
	int s = sizeof(list) / sizeof(list[0]);
    int idx = FindEle(list, 0, (s-1), targetvalue);

if (idx != -1){
    std::cout<<("El numero esta en la posicion: ") << idx;
} else{
    std::cout<<("No se encuentra este numero");
}
	return 0;
}
