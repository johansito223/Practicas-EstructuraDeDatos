#include <iostream>
int main() {
  int numeros[] = {1, 2, 3, 4, 5};
  int tam = sizeof(numeros) / sizeof(numeros[0]);
  for (int i = 0; i < tam; i++) {
    std::cout << numeros[i] << " ";
  }
      return 0;
}