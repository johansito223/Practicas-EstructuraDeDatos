function Selection(a){
    for (let i = 0; i < a.length; i++){
        let small = i;
        for (let j = i+1; j < a.length; j++){
            if (a[small] > a[j]){
                small = j;
            }
        }
        [a[i], a[small]] = [a[small], a[i]];
    }
}

function PrintArr(a){
    console.log(a);
}

let a = [65, 26, 13, 23, 12];
console.log("Arreglo antes de los cambios");
PrintArr(a);
Selection(a);
console.log("Arreeglo despues de los cambios");
PrintArr(a);