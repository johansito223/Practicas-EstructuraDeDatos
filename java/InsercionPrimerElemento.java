import java.util.Arrays;
public class InsercionPrimerElemento {
    public static void main(String[] args){
        int [] numeros = {10, 20, 30 , 40, 50};
        int [] nuevo = new int[numeros.length + 1]; 

        int posicion  = 0;
        int NewValue =  5;
//primero se muestra como era el arreglo antes de la insercion, luego se recorre el arreglo original hasta la posicion donde se quiere insertar el nuevo valor, se asigna el nuevo valor en esa posicion y luego se recorre el resto del arreglo original para asignar los valores al nuevo arreglo
        System.out.println("Antes de insertar asi se ve el arreglo: ");
        System.out.println(Arrays.toString(numeros));

        for (int j = 0; j<posicion; j++){
            nuevo[j]=numeros[j];
        }
//se asigna el nuevo valor en la posicion especificada
        nuevo[posicion] = NewValue;
        for (int j = posicion; j < numeros.length; j++){
            nuevo[j + 1] = numeros[j];

        }
        System.out.println("Ahora con la insercion el arreglo se ve asi: ");
        System.out.println(Arrays.toString(nuevo));
    }

}
