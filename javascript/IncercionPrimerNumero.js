

let lista = [10,20,30,40,50];
let nuevo = []
let position = 0
let number = 5

for (let j = 0;j<position;j++){
    nuevo[j] = lista[j]
}
nuevo[position]= number
for (j =  position; j < lista.length;j++){
    nuevo[j + 1] = lista[j]

}
console.log(nuevo)
