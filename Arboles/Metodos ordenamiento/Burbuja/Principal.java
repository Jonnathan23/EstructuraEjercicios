public class Principal {
    public static void main(String[] args) {
        int arreglo[] = { 10, 3, 99, 5, 1 };
        int aux = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}