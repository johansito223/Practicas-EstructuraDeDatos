function BubbleSort(a){
    let s = a.length;

    for (let i = 0; i < s; i++){
        let isSwapped = false;

        for (let j = 0; j < (s - i - 1); j++){
            if (a[j] > a[j + 1]){
                let x = a[j];
                a[j] = a[j + 1];
                a[j + 1] = x;
                isSwapped = true;
            }
        }
        if (!isSwapped){
            break;

        }
    }
}

let a = [15, 16, 11, 13 ,14];
console.log("Antes de ordenar los elementos del arreglo son: ", a);

BubbleSort(a)

console.log("Despues de ordenar los elementos del arreglo son: ", a);

