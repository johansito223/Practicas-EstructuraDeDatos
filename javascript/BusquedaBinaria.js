function  FindEle(arr, l , h , targetvalue ){
    while (l <= h) {
        let mid = (l + Math.floor((h - l) / 2))

        if (arr[mid] == targetvalue){
            return mid
        }else if (arr[mid]< targetvalue){
            l = (mid + 1)
        } else{
            h = (mid - 1)

        }

    }
return - 1
}

let list = [6, 10, 12, 19, 34, 40, 57, 69, 89, 98]
let targetvalue =  40
let s = list.length

let idx = FindEle(list, 0, (s-1), targetvalue)

if (idx != -1){
    console.log("El numero esta en la posicion: " + idx)
} else{
    console.log("No se encuentra este numero, andas valiendo verga")
}