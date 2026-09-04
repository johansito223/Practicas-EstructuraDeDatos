def BuscarVariableSecuencial(lista, variable):
    for i in range(len(lista)):
        if lista[i] == variable:
            return i
    return -1

lista = [6, 10, 12, 19, 34, 40, 57, 69, 89, 98]
variable = 40  

print("el numero esta en la posicion: ", BuscarVariableSecuencial(lista, variable) + 1)