package Pila;

public class PilaDinamica {
    private String arreglo[];
    private int posicion;

    public PilaDinamica() {

        this.arreglo = new String[2];
        this.posicion = 0;
    }

    public boolean empty() {
        if (posicion == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String str) {
        if (posicion < arreglo.length) {
            arreglo[posicion] = str;
            posicion++;
        } else {
            String temp[] = new String[arreglo.length + 2];
            for (int i = 0; i < arreglo.length; i++) {
                temp[i] = arreglo[i];
            }
            arreglo = temp;            
            arreglo[posicion] = str;
            posicion++;
            System.out.println("Pila redimensionada");
        }

    }

    public String peek() {
        if (posicion > 0) {
            return arreglo[posicion - 1];
        } else {
            return null;
        }
    }

    public String pop() {
        String temp = null;
        if (posicion > 0) {
            temp = arreglo[posicion - 1];
            arreglo[posicion - 1] = null;
            posicion--;
        }
        return temp;
    }
}
