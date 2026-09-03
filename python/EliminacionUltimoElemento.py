inputArr = [11, 21, 31, 41, 51 ,61]

print("Antes de la eliminacion el array es")
for j in range(len(inputArr)):
    print(inputArr[j], end =" ")
    
#eliminamos el ultimo numero
nuevo = []
for j in range(len(inputArr) - 1):
    nuevo.append(inputArr[j]) 
inputArr = nuevo

print("Despues de la eliminacion, el arreglo es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end =" ")

