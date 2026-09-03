inputArr = [10, 20, 30, 40 ,50]

position = len(inputArr)
ValuetoInsert = 5
#esta parte es la que inserta un numero en una posicion especifica de la lista, para esto se crea un nuevo arreglo y se le asigna a cada posicion el valor del arreglo original, pero en la posicion especificada se le asigna el numero a insertar
nuevo = []
for j in range(position):
    nuevo.append(inputArr[j])

nuevo.append(ValuetoInsert)

for j in range(position, len(inputArr)):
    nuevo.append(inputArr[j])
    
inputArr = nuevo
print(nuevo)