#include <iostream>

int main (){
	int numeros [] {11, 21, 31, 41 ,51};
	int j = 0;
	int tam = sizeof(numeros) / sizeof(numeros[0]);
	int posicion = tam;

	int nuevo [tam - 1];

    for (j; j<tam -1; j++ ){
    	nuevo[j] = numeros[j + 1];
    	std::cout<<nuevo[j]<<" ";
}

	return 0;
}
