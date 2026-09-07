public class RecorridoInverso {
    public static void main(String [] args){
        int [] numeros = {1, 2, 3, 4, 5};
        String men = "";
        for (int i = numeros.length - 1; i>= 0; i--){
            men += numeros[i] + " ";
        }
        System.out.println(men);
    }

}