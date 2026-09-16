function partition(a, l, h){
    let pvt = a[h];
    let j = l - 1;

    for (let k = l; k < h; k++){
        if (a[k] < pvt){
            j += 1;
            swap(a, j, k);
        }
    }
    swap(a, j + 1, h);
    return j + 1;
}

function swap(a, j, k){
    [a[j], a[k]] = [a[k], a[j]];
}

function qcksort(a, l, h){
    if (l < h){
        let pi = partition(a, l, h);
        qcksort(a, l, pi - 1);
        qcksort(a, pi + 1, h);
    }
}

let a = [10, 7, 8, 9, 1, 5];
let size = a.length;
console.log("El arreglo antes de ordenarlo: \n");
console.log(a);
console.log();
qcksort(a, 0, size - 1)
console.log("El arreglo despues de ordenarlo: \n");
console.log(a);