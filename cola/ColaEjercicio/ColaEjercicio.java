package ColaEjercicio;

public class ColaEjercicio<T> {
    NodoCola<T> cabeza;
    NodoCola<T> fin;
    String contenido;

    public ColaEjercicio() {
        this.cabeza = null;
        this.fin = null;
        this.contenido = "";
    }

    public boolean colaVacia() {
        return this.cabeza == null;
    }

    public void insertarNodo(T dato) {
        NodoCola<T> nuevoNodo = new NodoCola<>(dato);
        if (colaVacia()) {
            this.cabeza = nuevoNodo;
            this.fin = nuevoNodo;
            actualizarContenido();
            return;
        }
        this.fin.siguiente = nuevoNodo;
        this.fin = nuevoNodo;
        actualizarContenido();
    }



    public void actualizarContenido() {
        NodoCola puntero = this.cabeza;
        this.contenido = "";
        while (puntero != null) {
            // this.contenido += (puntero.elemento instanceof Number)?puntero.elemento + "
            // ":puntero.elemento;
            this.contenido += puntero.elemento + ", ";
            puntero = puntero.siguiente;
        }
    }

    public void mostrarContenido() {
        actualizarContenido();
        System.out.println(this.contenido);
    }
}
