public class RecorridoSecuencial {
    public static void main(String [] args){
        int [] numeros = {1, 2, 3, 4, 5};
        String men = "";
        for (int i = 0; i <numeros.length; i++){
            men += numeros[i] + " ";
        }
        System.out.println(men);
    }

}
