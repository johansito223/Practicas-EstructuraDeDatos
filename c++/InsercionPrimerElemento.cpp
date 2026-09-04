#include <iostream>

int main (){
	int numeros [] {10, 20, 30, 40 ,50};
	int j = 0;
	int posicion = 0;
	int newNumber = 5;
	int nuevo [6];

	for (j; j<posicion; j++ ){
    	nuevo[j] = numeros[j];
}
	nuevo[posicion] = newNumber;
	
	for (int j = posicion; j < 5; j++){
		nuevo[j + 1] = numeros [j];
	}
	
	for (int j; j<6; j++){
		std::cout<<nuevo[j]<<" ";
	}
	
	return 0;
}
