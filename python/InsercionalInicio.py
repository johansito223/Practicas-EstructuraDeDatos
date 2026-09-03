inputArr = [10, 20, 30, 40 ,50]

position = 0
ValuetoInsert = 5

nuevo = []
for j in range(position):
    nuevo.append(inputArr[j])

nuevo.append(ValuetoInsert)

for j in range(position, len(inputArr)):
    nuevo.append(inputArr[j])
    
inputArr = nuevo
print(nuevo)