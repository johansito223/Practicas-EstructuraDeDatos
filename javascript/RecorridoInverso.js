let lista = [1, 2, 3, 4, 5];
//vamos a recorrer secuencialmente
let imp = " "
for (let i = lista.length - 1; i >= 0; i--) {
    imp += lista[i] + " "
}
console.log(imp);
