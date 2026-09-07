
let numeros = [11, 21, 31, 41, 51];
console.log("Asi se ve la lista antes de la eliminacion");
console.log(numeros.toString());
//esta parte es la que elimina el primer numero de la lista, para esto se crea un nuevo arreglo y se le asigna a cada posicion el valor del arreglo original, pero empezando desde la segunda posicion

let n = numeros.length;
let pos = 2;
let nuevo = []
for (let j = 0; j<n -1; j++ ){
    if (j < pos){
        nuevo[j] = numeros[j];
    }else{
        nuevo[j] = numeros[j + 1];
    }
    
}
console.log("Despues de la eliminacion queda: ");
console.log(nuevo.toString());