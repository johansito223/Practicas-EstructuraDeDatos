

let lista = [10,20,30,40,50];
let nuevo = []
let position = lista.length
let number = 5
//esta parte es la que inserta un numero en una posicion especifica de la lista, para esto se crea un nuevo arreglo y se le asigna a cada posicion el valor del arreglo original, pero en la posicion especificada se le asigna el numero a insertar
for (let j = 0;j<position;j++){
    nuevo[j] = lista[j]
}
nuevo[position]= number
for (j =  position; j < lista.length;j++){
    nuevo[j + 1] = lista[j]

}
console.log(nuevo)
