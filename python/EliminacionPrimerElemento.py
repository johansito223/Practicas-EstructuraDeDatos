inputArr = [11, 21, 31, 41, 51, 61]
print("Antes de la eliminacion, el arreglo es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
#eliminando el primer elemento del inputArr

nuevo = []
for j in range(len(inputArr) - 1 ):
    nuevo.append(inputArr[j +1])
inputArr = nuevo
print("\n Despues de la eliminacion, el array es: ")

for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
    
#investigar como google verifica que el correo existe antes de crear la cuenta  