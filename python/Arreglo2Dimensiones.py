TwoDimensionalArray = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print ("Los elementos del arreglo son:")

for row in TwoDimensionalArray:
    for element in row:
        print(element, end=' ') #mostrar los elementos de la fila en la misma línea
    print()  #ir a la siguiente línea después de imprimir cada fila