public class Seleccion {
    public static void main(String[] args) {
        int arreglo[] = { 3, 7, 5, 1, 6 };
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        int minPos;
        int aux = 0;
        for (int i = 0; i < arreglo.length; i++) {
            minPos = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minPos]) {
                    minPos = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[minPos];
            arreglo[minPos] = aux;
        }
        System.out.println(" ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}