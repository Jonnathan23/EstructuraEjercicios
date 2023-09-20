package EjercicioLista;

public class NodoLista<T> {
    T elemento;
    NodoLista<T> siguiente;
    public NodoLista(T element){
        this.elemento = element;
        this.siguiente = null;
    }
}
