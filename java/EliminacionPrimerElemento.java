import java.util.Arrays;

public class EliminacionPrimerElemento {
    public static void main (String[] args){
        int[] numeros = {11, 21, 31, 41 ,51};
        System.out.println("antes de la eliminacion, el arreglo es: ");
        System.out.println(Arrays.toString(numeros));

        int [] nuevo = new int [numeros.length - 1];

        for (int j = 0; j < numeros.length - 1; j++ ){
            nuevo[j] = numeros[j + 1];
        }

        System.out.println("despues de la eliminacion queda: ");
        System.out.println(Arrays.toString(nuevo));


    }
    
}
