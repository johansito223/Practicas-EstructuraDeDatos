#include <iostream>

int main() {
    int TwoDimensionalArray[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    for (int i = 0; i<3; i++){
        std::cout << " ";
        for (int j = 0; j<3; j++){
            std::cout << TwoDimensionalArray[j][i] << " ";

        }
        std::cout << "\n";
    }
    return 0;
}