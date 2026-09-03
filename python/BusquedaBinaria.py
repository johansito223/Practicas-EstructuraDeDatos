def findEle (arr, l, h, targetvalue):
    while l <= h:
        mid = l + (h-l) // 2
        #verificar si targetvalue esta presente en mid
        if arr[mid] == targetvalue:
            return mid
        #si targetvalue es mayor que el elemento mid, considerar la segunda mitad (osease un ">")
        elif arr[mid] < targetvalue:
            l = mid + 1
        else:
            h = mid - 1
        #ya si no lo encuentra pues solo retornamos que no existe
    return -1
    
if __name__ == '__main__':
    inputArr = [6, 10, 12, 19, 34, 40, 57, 69, 89, 98 ]#la lsta original NO estaba ordenada, la ordene manualmente, hay forms de hacerlo pero aun no las vemos
    targetelement = 40
    s = len(inputArr)
    
    idx = findEle(inputArr, 0, s-1, targetelement)
    
    if idx != -1:
        print("el elemento se encuentra en la posicion " + str(idx+1))
    else:
        print("el elemento no se encuentra")    