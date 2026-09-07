inputArr = [11, 21, 31, 41, 51, 61]
print("Antes de la eliminacion, el arreglo es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
n = len(inputArr)
pos = int(input("Ingrese la posicion del elemento a eliminar: "))
for i in range((pos - 1 ), n - 1):
    inputArr[i] = inputArr[i + 1]

n-=1
inputArr = inputArr[:n]

    
print("\n Despues de la eliminacion, el array es: ")

for j in range(len(inputArr)):
    print(inputArr[j], end=" ")
    