import java.util.Arrays;

public class EliminacionPrimerElemento {
    public static void main (String[] args){
        int[] numeros = {11, 21, 31, 41 ,51};
        System.out.println("antes de la eliminacion, el arreglo es: ");
        System.out.println(Arrays.toString(numeros));
//en esta seccion se elimina el primer elemento del arreglo, para esto se crea un nuevo arreglo con una longitud menor al original y se le asigna a cada posicion el valor del arreglo original, pero empezando desde la segunda posicion
        int [] nuevo = new int [numeros.length - 1];

        for (int j = 0; j < numeros.length - 1; j++ ){
            nuevo[j] = numeros[j + 1];
        }

        System.out.println("despues de la eliminacion queda: ");
        System.out.println(Arrays.toString(nuevo));


    }
    
}
