let numeros = [11, 21, 31, 41, 51];
console.log("Asi se ve la lista antes de la eliminacion");
console.log(numeros.toString());

let nuevo = []
for (let j = 0; j<numeros.length -1; j++ ){
    nuevo[j] = numeros[j + 1];
}
console.log("Despues de la eliminacion queda: ");
console.log(nuevo.toString());