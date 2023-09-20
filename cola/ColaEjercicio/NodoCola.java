package ColaEjercicio;

public class NodoCola<T> {
    T elemento;
    NodoCola<T> siguiente;

    public NodoCola(T elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }
}
