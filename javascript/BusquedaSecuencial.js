function  FindEle(arr, targetvalue ){
    //esta funcion busca un elemento en un arreglo de manera binaria, es decir, divide el arreglo en dos partes y busca en la parte que corresponde al valor buscado
    for (let j = 0; j < arr.length; j++)
    {
        if (arr[j] == targetvalue)
            return j;
    }

return - 1
}
let list = [6, 10, 12, 19, 34, 40, 57, 69, 89, 98]
let targetvalue =  40

let idx = FindEle(list, targetvalue)

if (idx != -1){
    console.log("El numero esta en la posicion: " + idx)
} else{
    console.log("No se encuentra este numero, andas valiendo verga")
}