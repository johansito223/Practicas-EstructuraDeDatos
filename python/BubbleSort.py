def bubblesort(a):
    s = len(a)
    #iterando todos los elementos
    for j in range(s):
        isSwapped = False    
        for j in range(0, s - j - 1):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
                isSwapped = True
        if (isSwapped == False):
            break
        
if __name__ =="__main__":
    a = [15, 16, 11, 13, 14]
    print("Antes de el ordenar los elementos del array son: \n")
    for j in a:
        print (j, end= ' ')
    print()
    
    bubblesort(a)
    
    print("Despues de ordenar los elementos del array son: \n")
    for j in range(len(a)):
        print (a[j], end = ' ')                
    print()