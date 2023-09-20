public class Inserccion {
    public static void main(String[] args) {
        int arreglo[] = { 5, 6, 8, 1, 3 };
        int posicion, aux;

        for (int i = 0; i < arreglo.length; i++) {
            posicion = i;
            aux = arreglo[i];
            while ((posicion > 0) && (arreglo[posicion - 1] > aux)) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
       
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}