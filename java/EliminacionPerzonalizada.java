import java.util.Arrays;

public class EliminacionPerzonalizada {
    public static void main(String[] args) {
        int [] numeros = {11, 21, 31, 41, 51};
        int pos = 2;
        System.out.println("antes de la eliminacion, el arreglo es: ");
        System.out.println(Arrays.toString(numeros));
//en estas lineas se elimina el elemento en la posicion especificada, para esto se crea un nuevo arreglo con una longitud menor al original y se le asigna a cada posicion el valor del arreglo original, pero sin incluir el elemento en la posicion especificada
        int [] nuevo = new int [numeros.length - 1];

        for (int j = 0; j < pos; j++ ){
            nuevo[j] = numeros[j];
        }

        for (int j = pos; j < numeros.length - 1; j++ ){
            nuevo[j] = numeros[j + 1];
        }

        System.out.println("despues de la eliminacion queda: ");
        System.out.println(Arrays.toString(nuevo));

    }
}
