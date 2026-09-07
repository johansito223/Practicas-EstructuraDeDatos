#include <iostream>

int main (){
	int numeros [] {11, 21, 31, 41 ,51};
	int j = 0;
	int tam = sizeof(numeros) / sizeof(numeros[0]);
	int posicion;
    std::cout<<"Ingrese la posicion que desea eliminar: ";
	if (!(std::cin >> posicion) || posicion < 0 || posicion >= tam) {
		std::cout << "Posicion invalida. Use un numero entre 0 y " << tam - 1 << ".\n";
		return 1;
	}
	int nuevo [tam - 1];

    for (j ;j<posicion; j++ ){
    	nuevo[j] = numeros[j];
    	std::cout<<nuevo[j]<<" \n";
}
    for (j=posicion; j<tam -1; j++ ){
    	nuevo[j] = numeros[j+1];
    	std::cout<<nuevo[j]<<" \n";
}

	std::cout << '\n';

	return 0;
}
