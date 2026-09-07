let TwoDimensionalArray = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("Vamos a imprimis el arreglo")

for (let i = 0; i < TwoDimensionalArray.length; i++) {
    let fila = "";
    console.log(TwoDimensionalArray[i]);
    for (let j = 0; j < TwoDimensionalArray[i].length; j++) {
        fila += TwoDimensionalArray[i][j] + " ";
    }
}