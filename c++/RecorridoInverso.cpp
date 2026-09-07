#include <iostream>
int main() {
  int numeros[] = {1, 2, 3, 4, 5};
  int tam = sizeof(numeros) / sizeof(numeros[0]);
  for (int i = tam - 1; i >= 0; i--) {
    std::cout << numeros[i] << " ";
  }
  return 0;
}