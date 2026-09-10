function InsertionSort(a){
    for (let j = 1; j < a.length; j++){
        let temp = a[j];

        let i = j - 1;

        while ( i >= 0 && temp < a[i]){
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = temp;
        

        }

    }
function PrintArr(a){
        console.log(a);
    
}

let a = [70, 15, 2, 51, 60];

console.log("Antes de ordenar los elementos del arreglo: ");
PrintArr(a);

InsertionSort(a);

console.log("Despues de ordenar los elementos del arreglo");
PrintArr(a);