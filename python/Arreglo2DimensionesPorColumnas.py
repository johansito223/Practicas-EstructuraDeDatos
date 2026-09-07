TwoDimensionalArray = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Vamos a imprimir el arreglo")

for i in range(len(TwoDimensionalArray)):
    fila = ""
    for j in range(len(TwoDimensionalArray[i])):
        fila += str(TwoDimensionalArray[j][i]) + " "
    print(fila)