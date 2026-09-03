import java.util.Arrays;
public class InsercionUltimoElemento {
    public static void main(String[] args){
        int [] numeros = {10, 20, 30 , 40, 50};
        int [] nuevo = new int[numeros.length + 1]; 

        int posicion  = numeros.length;
        int NewValue =  60;

        System.out.println("Antes de insertar asi se ve el arreglo: ");
        System.out.println(Arrays.toString(numeros));

        for (int j = 0; j<posicion; j++){
            nuevo[j]=numeros[j];
        }

        nuevo[posicion] = NewValue;
        for (int j = posicion; j < numeros.length; j++){
            nuevo[j + 1] = numeros[j];

        }
        System.out.println("Ahora con la insercion el arreglo se ve asi: ");
        System.out.println(Arrays.toString(nuevo));
    }

}
